package net.konari.rpgcompanions.entity.client;

import net.konari.rpgcompanions.Rpgcompanions;
import net.konari.rpgcompanions.entity.custom.GolemEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class GolemRenderer extends GeoEntityRenderer<GolemEntity> {
    public GolemRenderer(EntityRendererFactory.Context ctx) {super(ctx, new GolemModel());
    }
    @Override
    public Identifier getTexture(GolemEntity entity) {
        return new Identifier(Rpgcompanions.MOD_ID,"textures/entity/golem/golem.png");
    }
}
