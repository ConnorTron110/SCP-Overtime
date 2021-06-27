package io.github.connortron110.overtime.common.entities.scp;

import io.github.connortron110.overtime.core.init.ModEntities;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.world.World;

public class SCP3199EggEntity extends MonsterEntity {

    public SCP3199EggEntity(EntityType<? extends MonsterEntity> type, World world) {
        super(type, world);
    }

    @Override
    public void baseTick() {
        super.baseTick();

        if (level.isClientSide) return;
        if (Math.random() < 0.001D && Math.random() < 0.01D && Math.random() < 0.1D) {
            remove();
            SCP3199Entity eggEntity = new SCP3199Entity(ModEntities.SCP3199.get(), level);
            eggEntity.moveTo(position());
            level.addFreshEntity(eggEntity);
        }
    }
}
