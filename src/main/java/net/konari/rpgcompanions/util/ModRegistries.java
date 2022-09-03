package net.konari.rpgcompanions.util;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.konari.rpgcompanions.entity.ModEntities;
import net.konari.rpgcompanions.entity.custom.ElfEntity;
import net.konari.rpgcompanions.entity.custom.GolemEntity;
import net.konari.rpgcompanions.entity.custom.KnightEntity;
import net.konari.rpgcompanions.entity.custom.WitchEntity;

public class ModRegistries {
    public static void registerModStuffs(){

        registerAttributes();

    }
    private static void registerAttributes(){
        FabricDefaultAttributeRegistry.register(ModEntities.WITCH, WitchEntity.setAttributes());

        FabricDefaultAttributeRegistry.register(ModEntities.GOLEM,GolemEntity.setAttributes());

        FabricDefaultAttributeRegistry.register(ModEntities.KNIGHT, KnightEntity.setAttributes());

        FabricDefaultAttributeRegistry.register(ModEntities.ELF, ElfEntity.setAttributes());
    }
}
