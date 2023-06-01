package fr.fewerelk.simpleadminarea.commands;

import org.bukkit.command.*;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.Bukkit;

import fr.fewerelk.simpleadminarea.commands.exceptions.*;


public class SAAcommand implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if ((sender instanceof Player) && (Bukkit.getPlayer(sender.getName()).hasPermission("saa.saa"))) {
            if (args.length == 0) {
                sender.sendMessage(ChatColor.GREEN + "---SAA HELP---\n/saa create <area> : create a new area.\n" + 
                "/saa pos1 <arena>\n/saa pos2 <arena>");
                return true;
            } else {
                switch (args[0]) {
                    case "create":
                        SAACreate commandc = new SAACreate();
                        return commandc.onCommand(sender, cmd, label, args);
                    case "pos1":
                        SAAPos1 command1 = new SAAPos1();
                        return command1.onCommand(sender, cmd, label, args);
                    case "pos2":
                        SAAPos2 command2 = new SAAPos2();
                        return command2.onCommand(sender, cmd, label, args);
                    default:
                        ArgError error = new ArgError();
                        error.argerror(sender.getName());
                        return false;
                }
            }
        } else {
            if (sender instanceof Player) {
                PermError error = new PermError();
                error.permerror(Bukkit.getPlayer(sender.getName()));
                return false;
            } else {
                ConsoleError error = new ConsoleError();
                error.consoleError();
                return false;
            }
        }
    }
}
