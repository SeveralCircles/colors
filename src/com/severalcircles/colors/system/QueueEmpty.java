package com.severalcircles.colors.system;

import com.severalcircles.colors.commands.CommandPM;
import com.severalcircles.colors.commands.Message;
import org.bukkit.ChatColor;

public class QueueEmpty {
    Message currentMessage;

    public void emptyMessageQueue() {
        int i = CommandPM.messageQueue.size();
        if (i == 0) {
            System.out.println("No unsent messages.");
        } else {
            System.out.println("Unsent messages waiting in queue. Attempting to send.");
        }
        while (i > 0) {
            currentMessage = CommandPM.messageQueue.poll();
            if (!currentMessage.getTarget().isOnline()) {
                // If the target isn't online, throw it to the back of the queue and ignore it for now.
                System.out.println("Sending message to " + currentMessage.getTarget().getName() + " failed.");
                CommandPM.messageQueue.add(currentMessage);
            } else {
                currentMessage.getTarget().sendMessage(ChatColor.GOLD + "[" + ChatColor.GREEN + currentMessage.getSender().getName() + ChatColor.GOLD + " -> " + ChatColor.GREEN + " You" + ChatColor.GOLD + "] " + ChatColor.RESET + currentMessage.getMessage());
                currentMessage.getSender().sendMessage(ChatColor.GREEN + "Message to " + currentMessage.getTarget().getName() + " sent successfully.");
            }
            i--;
        }
    }
}
