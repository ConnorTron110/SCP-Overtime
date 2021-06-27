package io.github.connortron110.overtime.common.entities.projectile;

import io.github.connortron110.overtime.core.init.ModEntities;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.LlamaSpitEntity;
import net.minecraft.network.IPacket;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.EntityRayTraceResult;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;
import net.minecraftforge.fml.network.NetworkHooks;

public class AcidSpitEntity extends LlamaSpitEntity {

    public AcidSpitEntity(EntityType<AcidSpitEntity> type, World world) {
        super(type, world);
    }

    public AcidSpitEntity(World world, LivingEntity entity) {
        this(ModEntities.ACID_SPIT.get(), world);
        setOwner(entity);
        this.setPos(entity.getX() - (double)(entity.getBbWidth() + 1.0F) * 0.5D * (double) MathHelper.sin(entity.yBodyRot * ((float)Math.PI / 180F)), entity.getEyeY() - (double)0.1F, entity.getZ() + (double)(entity.getBbWidth() + 1.0F) * 0.5D * (double)MathHelper.cos(entity.yBodyRot * ((float)Math.PI / 180F)));
    }

    @Override
    public void onAddedToWorld() {
        super.onAddedToWorld();

        if (!level.isClientSide) return;
        Vector3d delta = getDeltaMovement();
        for(int i = 0; i < 7; ++i) {
            double d0 = 0.4D + 0.1D * (double)i;
            level.addParticle(ParticleTypes.SPIT, getX(), getY(), getZ(), delta.x() * d0, delta.y(), delta.z() * d0);
        }
    }

    @Override
    protected void onHitEntity(EntityRayTraceResult entityRayTraceResult) {
        super.onHitEntity(entityRayTraceResult);

        Entity hitEntity = entityRayTraceResult.getEntity();
        hitEntity.getEntity().hurt(DamageSource.indirectMobAttack(this, (LivingEntity) getOwner()).setProjectile(), 1.0F);
        if (hitEntity instanceof LivingEntity) {
            ((LivingEntity) hitEntity).addEffect(new EffectInstance(Effects.WITHER, 600, 0, false, false));
            ((LivingEntity) hitEntity).addEffect(new EffectInstance(Effects.POISON, 600, 0, false, false));
        }
    }

    @Override
    public IPacket<?> getAddEntityPacket() {
        return NetworkHooks.getEntitySpawningPacket(this);
    }
}
