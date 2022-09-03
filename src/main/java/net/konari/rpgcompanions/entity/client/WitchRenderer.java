package net.konari.rpgcompanions.entity.client;

import com.google.common.collect.Maps;
import net.konari.rpgcompanions.Rpgcompanions;
import net.konari.rpgcompanions.entity.custom.WitchEntity;
import net.konari.rpgcompanions.entity.variant.WitchVariant;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import java.util.Map;

public class WitchRenderer extends GeoEntityRenderer<WitchEntity> {

    public static final Map<WitchVariant, Identifier> LOCATION_BY_VARIANTA =
            Util.make(Maps.newEnumMap(WitchVariant.class), (map) -> {
                map.put(WitchVariant.DEFAULT,
                        new Identifier(Rpgcompanions.MOD_ID, "textures/entity/witch/witchtexture.png"));
                map.put(WitchVariant.DARKB,
                        new Identifier(Rpgcompanions.MOD_ID,"textures/entity/witch/witchtextureb.png"));
                map.put(WitchVariant.YELLOWC,
                        new Identifier(Rpgcompanions.MOD_ID, "textures/entity/witch/witchtexturec.png"));
                map.put(WitchVariant.REDD,
                        new Identifier(Rpgcompanions.MOD_ID, "textures/entity/witch/witchtextured.png"));
            });





    public WitchRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new WitchModel());
    }
    @Override
    public Identifier getTextureResource(WitchEntity instance) {
        return LOCATION_BY_VARIANTA.get(instance.getVariantA());
    }
}
