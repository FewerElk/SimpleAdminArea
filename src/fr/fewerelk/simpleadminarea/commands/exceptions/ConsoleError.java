package fr.fewerelk.simpleadminarea.commands.exceptions;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;

public class ConsoleError {
    public void consoleError() {
        Bukkit.getLogger().warning(ChatColor.RED + "ACCES DENIED : you must be a player to use this command.");
    }
    
}
