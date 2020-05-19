package com.severalcircles.colors.events;

import com.severalcircles.colors.system.QueueEmpty;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class PlayerJoinEvent implements Listener {
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        new QueueEmpty().emptyMessageQueue();
    }

}
