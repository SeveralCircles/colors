package com.severalcircles.colors;

import com.severalcircles.colors.commands.CommandAbout;
import com.severalcircles.colors.commands.CommandNedry;
import com.severalcircles.colors.commands.CommandPersona;
import com.severalcircles.colors.events.ChatEvent;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;

public class Main extends JavaPlugin {
    public static int random;
    @Override
    public void onEnable() {
        try {
            System.out.println("Build number: " + classBuildTimeMillis());
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        System.out.println("Setting up config...");
        this.saveDefaultConfig();
        System.out.println("Loading config...");
        random = this.getConfig().getInt("random");
        if (!this.getConfig().getBoolean("enablePlugin")) {
            System.out.println("Plugin disabled in config. Disabling.");
            getServer().getPluginManager().disablePlugin(this);
        }
        System.out.println("Enabling commands...");
        this.getCommand("about").setExecutor(new CommandAbout());
        this.getCommand("persona").setExecutor(new CommandPersona());
        this.getCommand("access").setExecutor(new CommandNedry());
        getServer().getPluginManager().registerEvents(new ChatEvent(), this);
    }

    @Override
    public void onDisable() {
        System.out.println("See ya later!");
    }

    //Look, it's from Bowser
//It's me, Jerry Seinfeild from Garfeild Kart
//Joker Persona 5
// Testing codacy
    private long classBuildTimeMillis() throws URISyntaxException, IllegalStateException, IllegalArgumentException {
        URL resource = getClass().getResource(getClass().getSimpleName() + ".class");
        if (resource == null) {
            throw new IllegalStateException("Failed to find class file for class: " +
                    getClass().getName());
        }

        if (resource.getProtocol().equals("file")) {

            return new File(resource.toURI()).lastModified();

        } else if (resource.getProtocol().equals("jar")) {

            String path = resource.getPath();
            return new File(path.substring(5, path.indexOf("!"))).lastModified();

        } else {

            throw new IllegalArgumentException("Unhandled url protocol: " +
                    resource.getProtocol() + " for class: " +
                    getClass().getName() + " resource: " + resource.toString());
        }
    }
}