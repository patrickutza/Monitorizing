package me.bukkit.ManofRealSteel;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import net.md_5.bungee.api.ChatColor;

public class Steel extends JavaPlugin implements Listener{
	
	private static PlayerListener listener;
	PlayerManagement management;
        PlayerData playerdata = management.getPlayerData();
        SLR slr;
	@Override
	public void onEnable(){
		listener = new PlayerListener();
		
		Bukkit.getServer().getPluginManager().registerEvents(this, this);
	}
	@Override
	public void onDisable(){
		
	}
	 public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
         Player player = (Player) sender;
         if (cmd.getName().equalsIgnoreCase("stats")) {
                 if (args.length == 0) {
			if(!(sender instanceof player))
                	 System.out.println(ChatColor.RED + "Consola nu are statistici!");
			else
			  sender.sendMessage("statisticile tale:" + playerdata.printo(getPlayerName()) + playerdata.printa(getPlayerName())); 
                 }
                 Player target = Bukkit.getServer().getPlayer(args[0]);
                 if (target == null) {
                     sender.sendMessage(ChatColor.RED + "Player-ul nu exista!");
                     return true;
                 }
                 else
                	 sender.sendMessage("statistici pt player: " + playerdata.printo(target) + playerdata.printa(target);
         }
         if (cmd.getName().equalsIgnoreCase("clearstats")) {
             Player target = Bukkit.getServer().getPlayer(args[0]);
             if (target == null) {
                 player.sendMessage(ChatColor.RED + "Player-ul nu exista!");
                 return true;
             }
             else{
            	 playerdata.clearhash(target);
             }
         }
         return true;
         }
 }