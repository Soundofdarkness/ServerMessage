package com.soundoflight.servermessage;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.*;

public class servermessage extends JavaPlugin {

    public void onEnable(){ 
    	this.getLogger().info("Servermessage has been enabled. You are using verion 0.1.");
    }
     
    public void onDisable(){ 
     this.getLogger().info("Servermessage has been disabled.");
    }

    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
    	if(cmd.getName().equalsIgnoreCase("welcome")){ // Wenn /welcome ausgef�hrt wird wird ein Willkommen in den chat geschrieben
    		sender.sendMessage(ChatColor.GOLD + "Willkommen auf dem MMO-Server der Lux Caeli!");
    		this.getLogger().info( "Welcomed new players on the server");
    		return true;
    	} // Wenn das passiert, wird die Funktion abbrechen und true als Wert zur�ckgeben.
    	this.getLogger().info("Fehler beim ausf�hren von Welcome");
    	return false;
    	
    }


	
}
