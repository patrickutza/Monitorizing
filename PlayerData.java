package me.bukkit.ManofRealSteel;

import java.io.Serializable;
import java.util.HashMap;
import java.util.*;
mport org.Bukkit.Entity.Player;

class PlayerData implements Serializable {
    public HashMap<Player, Integer> onT;//timp petrecut in miscare
    public HashMap<Player, Integer> afkT;//timp petrecut afk
    
    PlayerData() {
        this.onT = new HashMap<>();
        this.afkT = new HashMap<>();
    }
    void clearhash(){//pentru clear stats
    	onT.clear();
    	afkT.clear();
    }
    void addonT(Player player, Integer cnt) {
        if(!onT.containsKey(player)) 
        	onT.put(player, 0);
        onT.put(player, onT.get(player) + cnt);//adaugam numarul de secunde la timpul in miscare al playerului 'player'
        
    } 

    void addafkT(Player player, Integer cnt) {
        if(!afkT.containsKey(player)) 
        	afkT.put(player, 0);
        afkT.put(player, afkT.get(player) + cnt);////adaugam numarul de secunde la timpul afk al playerului 'player'
        
    } 

    Integer printa(Player player) {
        Integer TS = afkT.get(player);
        return TS;//returnam timpul petrecutafk(a)
    }
    Integer printo(Player player) {
        Integer TM = onT.get(player);
        return TM;//returnam timpul petrecut in miscare/on(o)
    }

} 