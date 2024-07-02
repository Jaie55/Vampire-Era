
package net.mcreator.vampireera.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class AItem extends Item {
	public AItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
