
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.vampireera.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.vampireera.VampireEraMod;

public class VampireEraModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, VampireEraMod.MODID);
	public static final RegistryObject<SimpleParticleType> TEST_2 = REGISTRY.register("test_2", () -> new SimpleParticleType(false));
}
