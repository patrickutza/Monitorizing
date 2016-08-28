package me.bukkit.ManofRealSteel;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.HashSet;
import java.util.Iterator;

public class PlayerManagement{

	private HashSet<Player> m = new HashSet<>();
	private HashSet<Player> afk = new HashSet<>();
	public void movementdetect(Player player) {
        m.add(player);
    }
	public void afkdetect(Player player) {
        afk.add(player);
    }
	

}
