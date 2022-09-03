package net.konari.rpgcompanions.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.konari.rpgcompanions.Rpgcompanions;
import net.konari.rpgcompanions.entity.custom.ElfEntity;
import net.konari.rpgcompanions.entity.custom.GolemEntity;
import net.konari.rpgcompanions.entity.custom.KnightEntity;
import net.konari.rpgcompanions.entity.custom.WitchEntity;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


import static net.konari.rpgcompanions.Rpgcompanions.MOD_ID;

public class ModEntities {
    public static final EntityType<WitchEntity> WITCH = Registry.register(
            Registry.ENTITY_TYPE, new Identifier(Rpgcompanions.MOD_ID, "witch"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, WitchEntity::new)
                    .dimensions(EntityDimensions.fixed(0.4f, 1.5f)).build());

    public static final EntityType<GolemEntity> GOLEM = Registry.register(
            Registry.ENTITY_TYPE, new Identifier(Rpgcompanions.MOD_ID, "golem"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, GolemEntity::new)
                    .dimensions(EntityDimensions.fixed(0.9f, 2.7f)).build());

    public static final EntityType<KnightEntity> KNIGHT = Registry.register(
            Registry.ENTITY_TYPE, new Identifier(Rpgcompanions.MOD_ID, "knight"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, KnightEntity::new)
                    .dimensions(EntityDimensions.fixed(0.9f, 2.7f)).build());
    public static final EntityType<ElfEntity> ELF = Registry.register(

            Registry.ENTITY_TYPE, new Identifier(Rpgcompanions.MOD_ID, "elf"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, ElfEntity::new)
                    .dimensions(EntityDimensions.fixed(0.9f, 2.7f)).build());
}
