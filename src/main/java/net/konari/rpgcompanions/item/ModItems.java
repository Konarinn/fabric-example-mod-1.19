package net.konari.rpgcompanions.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.konari.rpgcompanions.Rpgcompanions;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModItems {



    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(Rpgcompanions.MOD_ID, name), item);
    }

    public static void registerModItems(){
        Rpgcompanions.LOGGER.info("registering Mod items for" + Rpgcompanions.MOD_ID);


    }
}
