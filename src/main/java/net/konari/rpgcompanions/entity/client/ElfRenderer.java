package net.konari.rpgcompanions.entity.client;

import com.google.common.collect.Maps;
import net.konari.rpgcompanions.Rpgcompanions;
import net.konari.rpgcompanions.entity.custom.ElfEntity;
import net.konari.rpgcompanions.entity.variant.ElfVariant;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import java.util.Map;

public class ElfRenderer extends GeoEntityRenderer<ElfEntity> {

    public static final Map<ElfVariant, Identifier> LOCATION_BY_VARIANTD =
            Util.make(Maps.newEnumMap(ElfVariant.class), (map) -> {
                map.put(ElfVariant.REDELF,
                        new Identifier(Rpgcompanions.MOD_ID, "textures/entity/elf/texture.png"));
                map.put(ElfVariant.YELLOWELFB,
                        new Identifier(Rpgcompanions.MOD_ID,"textures/entity/elf/elftextureb.png"));
                map.put(ElfVariant.REDELFB,
                        new Identifier(Rpgcompanions.MOD_ID, "textures/entity/elf/elftexturec.png"));
                map.put(ElfVariant.DEFAULT,
                        new Identifier(Rpgcompanions.MOD_ID, "textures/entity/elf/elftextured.png"));
            });







    public ElfRenderer(EntityRendererFactory.Context ctx) {super(ctx, new ElfModel());
    }
    @Override
    public Identifier getTextureResource(ElfEntity instance) {
        return LOCATION_BY_VARIANTD.get(instance.getVariant());
    }
}
