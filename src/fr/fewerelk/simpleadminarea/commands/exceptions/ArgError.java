package fr.fewerelk.simpleadminarea.commands.exceptions;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;

public class ArgError {
    public void argerror(String sender) {
        if (sender == "") {
            Bukkit.getLogger().warning(ChatColor.RED + "Error : bad subcommand. Type \"saa\" for help.");
        } else {
            Bukkit.getPlayer(sender).sendMessage(ChatColor.RED + "Error : bad subcommand. Type \"saa\" for help.");
        }
    }
    
}
