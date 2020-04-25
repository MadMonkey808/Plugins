package dev.madmonkey.staffalert.Alert;

import com.sk89q.worldedit.WorldEdit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

public class Alert implements Listener, CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player p = (Player) sender;
        if(!(p.hasPermission("madstaff.alert"))){
            p.sendMessage(ChatColor.RED + "You do not have permissions!");
        }

        return false;
    }
}
