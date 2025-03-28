package net.cjsah.lobster.mathematics.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class EqualsBlock extends OperationBlock {
    public static final BooleanProperty POWERED = BlockStateProperties.POWERED;

    public static final Integer MAX_NUMBER_LENGTH = 16;

    public EqualsBlock(Properties properties) {
        super(properties, "equals");
        this.registerDefaultState(
            this.stateDefinition
                .any()
                .setValue(POWERED, false)
        );
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.@NotNull Builder<Block, BlockState> builder) {
        super.createBlockStateDefinition(builder);
        builder.add(POWERED);
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        FluidState fluidstate = context.getLevel().getFluidState(context.getClickedPos());
        BlockState blockstate = this.defaultBlockState();
        if (context.getLevel().hasNeighborSignal(context.getClickedPos())) {
            blockstate = blockstate.setValue(POWERED, true);
        } else {
            blockstate = blockstate.setValue(FACING, context.getHorizontalDirection().getOpposite())
                .setValue(POWERED, false);
        }
        return blockstate.setValue(WATERLOGGED, fluidstate.getType() == Fluids.WATER);
    }

    @Override
    protected void neighborChanged(
        @NotNull BlockState state,
        Level level,
        @NotNull BlockPos pos,
        @NotNull Block block,
        @NotNull BlockPos fromPos,
        boolean isMoving
    ) {
        if (!level.isClientSide) {
            boolean powered = level.hasNeighborSignal(pos);
            if (powered != state.getValue(POWERED)) {
                level.setBlock(pos, state.setValue(POWERED, powered), 2);
                if (powered) {
                    Direction requiredFacing = state.getValue(FACING);
                    Direction scanDir = requiredFacing.getClockWise();
                    List<Integer> num1 = readNumSequence(level, pos, scanDir, requiredFacing, 1);
                    String operator="";
                    List<Integer> num2 = Collections.emptyList();
                    if (!num1.isEmpty()) {
                        BlockPos opPos = pos.relative(scanDir, num1.size() + 1);
                        BlockState opState = level.getBlockState(opPos);
                        if (isValidOperator(opState, requiredFacing)) {
                            operator = ((OperationBlock) opState.getBlock()).OPERATOR;
                            if (!operator.equals("equals")) num2 = readNumSequence(level, opPos, scanDir, requiredFacing, 1);
                        }
                    }
                    System.out.print(num1);
                    System.out.print(operator);
                    System.out.print(num2);
                }
            }
        }
    }

    private List<Integer> readNumSequence(
        Level level,
        BlockPos startPos,
        Direction scanDir,
        Direction requiredFacing,
        int startOffset
    ) {
        List<Integer> digits = new ArrayList<>();
        for (int offset = startOffset; offset <= MAX_NUMBER_LENGTH; offset++) {
            BlockPos checkPos = startPos.relative(scanDir, offset);
            BlockState state = level.getBlockState(checkPos);

            // 严格终止条件
            if (!(state.getBlock() instanceof NumberBlock) ||
                state.getValue(FACING) != requiredFacing) {
                break; // 遇到无效方块立即终止
            }

            digits.add(((NumberBlock) state.getBlock()).number);
        }
        return digits;
    }

    private boolean isValidOperator(BlockState state, Direction requiredFacing) {
        return state.getBlock() instanceof OperationBlock &&
            state.getValue(FACING) == requiredFacing &&
            !((OperationBlock) state.getBlock()).OPERATOR.isEmpty();
    }
}
