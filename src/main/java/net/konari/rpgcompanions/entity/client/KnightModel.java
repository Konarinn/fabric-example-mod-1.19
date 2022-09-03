package net.konari.rpgcompanions.entity.client;

import net.konari.rpgcompanions.Rpgcompanions;
import net.konari.rpgcompanions.entity.custom.GolemEntity;
import net.konari.rpgcompanions.entity.custom.KnightEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.model.provider.data.EntityModelData;

public class KnightModel extends AnimatedGeoModel<KnightEntity> {
    @Override
    public Identifier getModelResource(KnightEntity object) {
        return new Identifier(Rpgcompanions.MOD_ID, "geo/knight.geo.json");
    }

    @Override
    public Identifier getTextureResource(KnightEntity object) {
        return KnightRenderer.LOCATION_BY_VARIANTB.get(object.getVariantB());
    }

    @Override
    public Identifier getAnimationResource(KnightEntity animatable) {
        return new Identifier(Rpgcompanions.MOD_ID,"animations/knight/model.animation.json");
    }
    @Override
    public void setLivingAnimations(KnightEntity entity, Integer uniqueID, AnimationEvent customPredicate) {
        super.setLivingAnimations(entity, uniqueID, customPredicate);
        IBone head = this.getAnimationProcessor().getBone("head");

        EntityModelData extraData = (EntityModelData) customPredicate.getExtraDataOfType(EntityModelData.class).get(0);
        if (head != null) {
            head.setRotationX(extraData.headPitch * ((float) Math.PI / 180F));
            head.setRotationY(extraData.netHeadYaw * ((float) Math.PI / 180F));
        }
    }
}
