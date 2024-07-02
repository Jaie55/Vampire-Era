
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.vampireera.init;

import org.checkerframework.checker.units.qual.A;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.vampireera.item.AItem;
import net.mcreator.vampireera.VampireEraMod;

public class VampireEraModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, VampireEraMod.MODID);
	public static final RegistryObject<Item> A = REGISTRY.register("a", () -> new AItem());
	// Start of user code block custom items
	// End of user code block custom items
}
