package dev.madmonkey.madhub.Utils;

import org.bukkit.ChatColor;

public class ChatFormat {
    public static String color(String msg){
        return ChatColor.translateAlternateColorCodes('&', msg);
    }
}
