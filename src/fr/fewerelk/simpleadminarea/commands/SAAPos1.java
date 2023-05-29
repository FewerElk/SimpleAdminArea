package fr.fewerelk.simpleadminarea.commands;

import org.bukkit.command.*;
import org.bukkit.entity.Player;
import fr.fewerelk.simpleadminarea.commands.exceptions.ConsoleError;

public class SAAPos1 implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player) {
            return true;
        } else {
            ConsoleError error = new ConsoleError();
            error.consoleError();
            return false;
        }
    }
    
}
