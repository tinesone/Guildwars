package nl.jetseverschuren.guildwars;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class Classes {

	public ItemStack[] getGear(Player target) {
		ItemStack chestplate = new ItemStack(Material.IRON_CHESTPLATE);
		
		ItemStack[] gear = new ItemStack[10];
		gear[1] = chestplate;
		return gear;
	}
}
