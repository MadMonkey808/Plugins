package dev.madmonkey.madhub.Commands;

import dev.madmonkey.madhub.Utils.ChatFormat;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Vanish implements CommandExecutor {

    String prefix = ChatFormat.color("&4MadHub &7| ");

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!cmd.getName().equalsIgnoreCase("vanish"))
            return false;
        if(!(sender instanceof Player)){
            sender.sendMessage(prefix + ChatFormat.color("&cOnly Players can execute this command!"));
            return true;
        }
        Player p = (Player) sender;
        if(!p.hasPermission("madhub.vanish")){
            p.sendMessage(prefix + ChatFormat.color("&cYou do not have permissions to execute this command!"));
            return true;
        }


        return false;
    }
}
