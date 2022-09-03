package net.konari.rpgcompanions.entity.client;

import com.google.common.collect.Maps;
import net.konari.rpgcompanions.Rpgcompanions;
import net.konari.rpgcompanions.entity.custom.KnightEntity;
import net.konari.rpgcompanions.entity.variant.KnightVariant;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import java.util.Map;

public class KnightRenderer extends GeoEntityRenderer<KnightEntity> {

    public static final Map<KnightVariant, Identifier> LOCATION_BY_VARIANTB =
            Util.make(Maps.newEnumMap(KnightVariant.class), (map) -> {
                map.put(KnightVariant.DEFAULT,
                        new Identifier(Rpgcompanions.MOD_ID, "textures/entity/knight/texture.png"));
                map.put(KnightVariant.BLUEK,
                        new Identifier(Rpgcompanions.MOD_ID,"textures/entity/knight/textureb.png"));
                map.put(KnightVariant.GRENK,
                        new Identifier(Rpgcompanions.MOD_ID, "textures/entity/knight/texturec.png"));
                map.put(KnightVariant.REDK,
                        new Identifier(Rpgcompanions.MOD_ID, "textures/entity/knight/textured.png"));
            });





    public KnightRenderer(EntityRendererFactory.Context ctx) {super(ctx, new KnightModel());
    }
    @Override
    public Identifier getTextureResource(KnightEntity instance) {
        return LOCATION_BY_VARIANTB.get(instance.getVariantB());
    }
}
