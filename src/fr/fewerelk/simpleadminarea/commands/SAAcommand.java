package fr.fewerelk.simpleadminarea.commands;

import org.bukkit.command.*;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

import fr.fewerelk.simpleadminarea.commands.exceptions.*;


public class SAAcommand implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player) {
            if (args.length == 0) {
                sender.sendMessage(ChatColor.GREEN + "---SAA HELP---\n/saa create <area> : create a new area.");
            } else {
                switch (args[0]) {
                    case "create":
                        SAACreate commandc = new SAACreate();
                        commandc.onCommand(sender, cmd, label, args);
                    case "pos1":
                        SAAPos1 command1 = new SAAPos1();
                        command1.onCommand(sender, cmd, label, args);
                    case "pos2":
                        SAAPos2 command2 = new SAAPos2();
                        command2.onCommand(sender, cmd, label, args);
                    default:
                        ArgError error = new ArgError();
                        error.argerror(sender.getName());
                }
            }
        } else {
            Bukkit.getLogger().info(ChatColor.GREEN + "---SAA HELP---\n/saa create <area> : create a new area.");
        }
        return true;
    }
}
