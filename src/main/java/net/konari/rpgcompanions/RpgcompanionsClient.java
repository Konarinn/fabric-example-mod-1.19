package net.konari.rpgcompanions;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.konari.rpgcompanions.entity.ModEntities;
import net.konari.rpgcompanions.entity.client.ElfRenderer;
import net.konari.rpgcompanions.entity.client.GolemRenderer;
import net.konari.rpgcompanions.entity.client.KnightRenderer;
import net.konari.rpgcompanions.entity.client.WitchRenderer;

public class RpgcompanionsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        EntityRendererRegistry.register(ModEntities.WITCH, WitchRenderer::new);

        EntityRendererRegistry.register(ModEntities.GOLEM, GolemRenderer::new);

        EntityRendererRegistry.register(ModEntities.KNIGHT, KnightRenderer::new);

        EntityRendererRegistry.register(ModEntities.ELF, ElfRenderer::new);

    }
}
