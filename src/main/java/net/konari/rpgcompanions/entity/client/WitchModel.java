package net.konari.rpgcompanions.entity.client;

import net.konari.rpgcompanions.Rpgcompanions;
import net.konari.rpgcompanions.entity.custom.WitchEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.model.provider.data.EntityModelData;

public class WitchModel extends AnimatedGeoModel<WitchEntity> {
    @Override
    public Identifier getModelResource(WitchEntity object) {
        return new Identifier(Rpgcompanions.MOD_ID,"geo/witch.geo.json");
    }

    @Override
    public Identifier getTextureResource(WitchEntity object) {
        return WitchRenderer.LOCATION_BY_VARIANTA.get(object.getVariantA());
    }

    @Override
    public Identifier getAnimationResource(WitchEntity animatable) {
        return new Identifier(Rpgcompanions.MOD_ID,"animations/witch/model.animation.json");
    }
    @SuppressWarnings({ "unchecked", "rawtypes" })
    @Override
    public void setLivingAnimations(WitchEntity entity, Integer uniqueID, AnimationEvent customPredicate) {
        super.setLivingAnimations(entity, uniqueID, customPredicate);
        IBone head = this.getAnimationProcessor().getBone("head");

        EntityModelData extraData = (EntityModelData) customPredicate.getExtraDataOfType(EntityModelData.class).get(0);
        if (head != null) {
            head.setRotationX(extraData.headPitch * ((float) Math.PI / 180F));
            head.setRotationY(extraData.netHeadYaw * ((float) Math.PI / 180F));
        }
    }
}
