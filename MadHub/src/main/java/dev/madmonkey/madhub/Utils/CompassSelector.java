package dev.madmonkey.madhub.Utils;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class CompassSelector implements Listener {

    public CompassSelector(Player player){

        String survivalist =  ChatFormat.color("&aOnline: ") + player.getServer().getOnlinePlayers() + ChatFormat.color("&a / ") + Bukkit.getServer().getMaxPlayers();

        Inventory inv = Bukkit.createInventory(null, 27, ChatFormat.color("&b&lServer"));

        ItemStack empty = new ItemStack(Material.BLACK_STAINED_GLASS_PANE, 1);
        ItemMeta emptyM = empty.getItemMeta();
        emptyM.setDisplayName(ChatFormat.color(" "));
        empty.setItemMeta(emptyM);

        ItemStack survival = new ItemStack(Material.GRASS_BLOCK, 1);
        ItemMeta survivalM = survival.getItemMeta();
        ArrayList<String>Lore = new ArrayList<String>();
        survivalM.setDisplayName(ChatFormat.color("&a&lSurvival"));
        survival.setItemMeta(survivalM);
        Lore.add(survivalist);
        survivalM.setLore(Lore);

        ItemStack prison = new ItemStack(Material.IRON_BARS, 1);
        ItemMeta prisonM = survival.getItemMeta();
        prisonM.setDisplayName(ChatFormat.color("&7&lPrison"));
        prison.setItemMeta(prisonM);

        ItemStack skyblock = new ItemStack(Material.CHEST, 1);
        ItemMeta skyblockM = survival.getItemMeta();
        skyblockM.setDisplayName(ChatFormat.color("&b&lSkyblock"));
        skyblock.setItemMeta(skyblockM);

        inv.setItem(11, survival);
        inv.setItem(13, prison);
        inv.setItem(15, skyblock);


        player.openInventory(inv);
    }
}
