package net.konari.rpgcompanions.entity.client;

import net.konari.rpgcompanions.Rpgcompanions;
import net.konari.rpgcompanions.entity.custom.GolemEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.model.provider.data.EntityModelData;


public class GolemModel extends AnimatedGeoModel<GolemEntity>{

    @Override
    public Identifier getModelResource(GolemEntity object) {
        return new Identifier(Rpgcompanions.MOD_ID, "geo/golem.geo.json");
    }

    @Override
    public Identifier getTextureResource(GolemEntity object) {
        return new Identifier(Rpgcompanions.MOD_ID,"textures/entity/golem/golem.png");
    }

    @Override
    public Identifier getAnimationResource(GolemEntity animatable) {
        return new Identifier(Rpgcompanions.MOD_ID,"animations/golem/model.animation.json");
    }
    @SuppressWarnings({ "unchecked", "rawtypes" })
    @Override
    public void setLivingAnimations(GolemEntity entity, Integer uniqueID, AnimationEvent customPredicate) {
        super.setLivingAnimations(entity, uniqueID, customPredicate);
        IBone head = this.getAnimationProcessor().getBone("head");

        EntityModelData extraData = (EntityModelData) customPredicate.getExtraDataOfType(EntityModelData.class).get(0);
        if (head != null) {
            head.setRotationX(extraData.headPitch * ((float) Math.PI / 180F));
            head.setRotationY(extraData.netHeadYaw * ((float) Math.PI / 180F));
        }
    }
}
