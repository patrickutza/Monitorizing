package me.bukkit.ManofRealSteel;

import java.io.Serializable;
import java.util.HashMap;
import java.util.*;

class PlayerData implements Serializable {
    public HashMap<String, Integer> onT;//timp petrecut in miscare
    public HashMap<String, Integer> afkT;//timp petrecut afk
    
    PlayerData() {
        this.onT = new HashMap<>();
        this.afkT = new HashMap<>();
    }
    void clearhash(){//pentru clear stats
    	onT.clear();
    	afkT.clear();
    }
    void addonT(String player, Integer cnt) {
        if(!onT.containsKey(player)) 
        	onT.put(player, 0);
        onT.put(player, onT.get(player) + cnt);//adaugam numarul de secunde la timpul in miscare al playerului 'player'
        
    } 

    void addafkT(String player, Integer cnt) {
        if(!afkT.containsKey(player)) 
        	afkT.put(player, 0);
        afkT.put(player, afkT.get(player) + cnt);////adaugam numarul de secunde la timpul afk al playerului 'player'
        
    } 

    Integer printa(String player) {
        Integer TS = afkT.get(player);
        return TS;//returnam timpul petrecutafk(a)
    }
    Integer printo(String player) {
        Integer TM = onT.get(player);
        return TM;//returnam timpul petrecut in miscare/on(o)
    }

} 