package com.severalcircles.colors;

import com.severalcircles.colors.commands.CommandAbout;
import com.severalcircles.colors.commands.CommandPersona;
import com.severalcircles.colors.commands.CommandSans;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        System.out.println("Enabling commands...");
        this.getCommand("about").setExecutor(new CommandAbout());
        this.getCommand("persona").setExecutor(new CommandPersona());
        this.getCommand("sans").setExecutor(new CommandSans());
    }

    @Override
    public void onDisable() {
        System.out.println("See ya later!");
    }
}
//Look, it's from Bowser
//It's me, Jerry Seinfeild from Garfeild Kart
//Joker Persona 5
// Testing codacy