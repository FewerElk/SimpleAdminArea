package fr.fewerelk.simpleadminarea.commands.exceptions;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class PermError {
    public void permerror(Player p) {
        p.sendMessage(ChatColor.RED + "ACCES DENIED : you haven't the specific permission to perform this command.");
    }
    
}
