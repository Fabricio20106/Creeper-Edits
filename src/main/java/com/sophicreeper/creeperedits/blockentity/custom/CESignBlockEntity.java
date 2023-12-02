package com.sophicreeper.creeperedits.blockentity.custom;

import com.sophicreeper.creeperedits.blockentity.CEBlockEntities;
import net.minecraft.tileentity.SignTileEntity;
import net.minecraft.tileentity.TileEntityType;

public class CESignBlockEntity extends SignTileEntity {
    public CESignBlockEntity() {
        super();
    }

    @Override
    public TileEntityType<?> getType() {
        return CEBlockEntities.CREEPER_SIGN.get();
    }
}
