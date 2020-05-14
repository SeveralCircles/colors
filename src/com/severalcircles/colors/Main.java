package com.severalcircles.colors;

import com.severalcircles.colors.commands.CommandAbout;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        System.out.println("Enabling commands...");
        this.getCommand("about").setExecutor(new CommandAbout());
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