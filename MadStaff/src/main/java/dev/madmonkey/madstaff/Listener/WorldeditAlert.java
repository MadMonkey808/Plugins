package dev.madmonkey.madstaff.Listener;

import net.md_5.bungee.BungeeCord;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

public class WorldeditAlert implements Listener {

    @EventHandler
    public void onCommandProcess(PlayerCommandPreprocessEvent event) {
        for(ProxiedPlayer staff : BungeeCord.getInstance().getPlayers()){
            if(staff.hasPermission("madstaff.alert")){
                if(event.getMessage().startsWith("//")){
                    staff.sendMessage(new TextComponent("§7[§4§lSTAFF ALERT§7] " + event.getPlayer().getName() + " §cused WorldEdit"));
                }
            }
        }
    }
}


