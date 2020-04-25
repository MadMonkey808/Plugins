package dev.madmonkey.madhub.Commands;

import dev.madmonkey.madhub.Main;
import dev.madmonkey.madhub.Utils.ChatFormat;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SetLobby implements CommandExecutor {

    String prefix = ChatFormat.color("&4MadHub &7| ");

    public SetLobby (Main main){
        Bukkit.getPluginCommand("setlobby").setExecutor(this);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!cmd.getName().equalsIgnoreCase("setlobby"))
            return false;
        if (!(sender instanceof Player)) {
            sender.sendMessage("Only players can execute this command!");
            return true;
        }
        Player p = (Player) sender;
        if (!p.hasPermission("madhub.setlobby")) {
            p.sendMessage(prefix + ChatFormat.color("&cYou do not have permissions to execute this command!"));
            return true;
        }
        double x = p.getLocation().getX();
        double y = p.getLocation().getY();
        double z = p.getLocation().getZ();
        Main.getInstance().getConfig().set("spawn.world", p.getLocation().getWorld().getName());
        Main.getInstance().getConfig().set("spawn.x", Double.valueOf(p.getLocation().getX()));
        Main.getInstance().getConfig().set("spawn.y", Double.valueOf(p.getLocation().getY()));
        Main.getInstance().getConfig().set("spawn.z", Double.valueOf(p.getLocation().getZ()));
        Main.getInstance().getConfig().set("spawn.yaw", Float.valueOf(p.getLocation().getYaw()));
        Main.getInstance().getConfig().set("spawn.pitch", Float.valueOf(p.getLocation().getPitch()));
        Main.getInstance().saveConfig();
        p.sendMessage(prefix + "&aYou have created a spawn to your current location");
        p.sendMessage("+ x + y + z");
        return true;
    }
}



