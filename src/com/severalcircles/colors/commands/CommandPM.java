package com.severalcircles.colors.commands;

import com.severalcircles.colors.system.QueueEmpty;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.Queue;

public class CommandPM implements CommandExecutor {
    private static final int messageID = 0;
    public static Queue<Message> messageQueue;

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args) {
        Player player = (Player) commandSender;
        Player target = Bukkit.getPlayer(args[0]);
        if (target == null) {
            if (Bukkit.getOfflinePlayer(args[0]) != null) {
                target = (Player) Bukkit.getOfflinePlayer(args[0]);
            } else {
                player.sendMessage(ChatColor.RED + "Couldn't find that player.");
                return false;
            }
        } else if (args[1] == null) {
            player.sendMessage(ChatColor.RED + "Not sending empty message, aborting.");
            return false;
        } else if (!player.hasPermission("com.severalcircles.colors.messages")) {
            player.sendMessage(ChatColor.RED + "You don't have permission to do that.");
            return true;
        }
        String messageText = String.join(" ", args);
        messageText = messageText.replace(args[0], null);
        Message message = new Message(player, target, messageText);
        messageQueue.add(message);
        player.sendMessage(ChatColor.GREEN + "Message queued.");
        new QueueEmpty().emptyMessageQueue();
        return true;
    }
}
