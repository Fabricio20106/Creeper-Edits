package com.sophicreeper.creeperedits.block.custom;

import com.sophicreeper.creeperedits.blockentity.custom.CESignBlockEntity;
import net.minecraft.block.StandingSignBlock;
import net.minecraft.block.WoodType;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockReader;

public class CEStandingSignBlock extends StandingSignBlock {
    public CEStandingSignBlock(Properties properties, WoodType woodType) {
        super(properties, woodType);
    }

    @Override
    public TileEntity newBlockEntity(IBlockReader world) {
        return new CESignBlockEntity();
    }
}
