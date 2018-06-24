package me.Geo.DoggsRequests;

import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;
import pl.betoncraft.betonquest.BetonQuest;;
public class Main extends JavaPlugin {

	String points[];
	@Override
	public void onEnable()
	{
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
	{
		if(cmd.getName() == "topquest")
		{
			for (OfflinePlayer player : Bukkit.getWhitelistedPlayers()) {
				
			}
			return true;
		}
		return false;
	}
	
}
