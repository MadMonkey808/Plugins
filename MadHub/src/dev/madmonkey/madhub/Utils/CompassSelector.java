package dev.madmonkey.madhub.Utils;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class CompassSelector {

    public CompassSelector (Player player){

        Inventory inv = Bukkit.createInventory(player, 27, ChatFormat.color("&b&lServer"));

        ItemStack survival = new ItemStack(Material.GRASS, 1);
        ItemMeta survivalM = survival.getItemMeta();
        survivalM.setDisplayName(ChatFormat.color("&a&lSurvival"));
        survival.setItemMeta(survivalM);
    }
}
