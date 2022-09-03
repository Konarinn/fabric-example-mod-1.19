package net.konari.rpgcompanions.entity.client;

import net.konari.rpgcompanions.Rpgcompanions;
import net.konari.rpgcompanions.entity.custom.ElfEntity;
import net.konari.rpgcompanions.entity.custom.GolemEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.model.provider.data.EntityModelData;

public class ElfModel extends AnimatedGeoModel<ElfEntity> {
    @Override
    public Identifier getModelResource(ElfEntity object) {
        return new Identifier(Rpgcompanions.MOD_ID, "geo/elfwarrior.geo.json");
    }

    @Override
    public Identifier getTextureResource(ElfEntity object) {
        return ElfRenderer.LOCATION_BY_VARIANTD.get(object.getVariant());
    }

    @Override
    public Identifier getAnimationResource(ElfEntity animatable) {
        return new Identifier(Rpgcompanions.MOD_ID,"animations/elf/model.animation.json");
    }
    @Override
    public void setLivingAnimations(ElfEntity entity, Integer uniqueID, AnimationEvent customPredicate) {
        super.setLivingAnimations(entity, uniqueID, customPredicate);
        IBone head = this.getAnimationProcessor().getBone("head");

        EntityModelData extraData = (EntityModelData) customPredicate.getExtraDataOfType(EntityModelData.class).get(0);
        if (head != null) {
            head.setRotationX(extraData.headPitch * ((float) Math.PI / 180F));
            head.setRotationY(extraData.netHeadYaw * ((float) Math.PI / 180F));
        }
    }
}
