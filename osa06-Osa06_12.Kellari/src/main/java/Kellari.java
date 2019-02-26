/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author janek
 */

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;

public class Kellari {
    
    private HashMap<String, ArrayList<String>> kellari;

    public Kellari(){
        this.kellari = new HashMap<>();
    }
    
    
    public void lisaa(String komero, String tavara){
        this.kellari.putIfAbsent(komero, new ArrayList<String>());
        
        this.kellari.get(komero).add(tavara);
    }
    
    public ArrayList<String> sisalto(String komero){
        if(this.kellari.get(komero) == null)
            return new ArrayList<String>();
        
        return this.kellari.get(komero);
    }
    
    public void poista(String komero, String tavara){
        if(this.kellari.get(komero) == null)
            return;
        
        int tavara_index = this.kellari.get(komero).indexOf(tavara);
        this.kellari.get(komero).remove(tavara_index);
        
        if(this.kellari.get(komero).size() < 1)
            this.kellari.remove(komero);
    }
    
    public ArrayList<String> komerot(){
        ArrayList<String> result = new ArrayList<String>();
        
        for(String komero : this.kellari.keySet()){
            if(this.kellari.get(komero).size() < 1)
                continue;
            
            result.add(komero);
        }
        return result;
    }
}
