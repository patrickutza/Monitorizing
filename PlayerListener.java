package me.bukkit.ManofRealSteel;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class PlayerListener implements Listener , Runnable{
	
	private PlayerManagement playerManagement;
	@EventHandler
    public void onMoveEvent(PlayerMoveEvent event) {
        if(event.getFrom().getX() == event.getTo().getX() && event.getFrom().getZ() == event.getTo().getZ()) { // if you stayed in one place
            if(event.getFrom().getY() == event.getTo().getY()) return; 
        }
		playerManagement.movementdetect(event.getPlayer());
    }
	private PlayerData playerData;
	PlayerData getPlayerData() {
        return this.playerData;
    }
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
