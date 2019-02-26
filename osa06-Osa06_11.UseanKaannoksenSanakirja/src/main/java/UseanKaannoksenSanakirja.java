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

public class UseanKaannoksenSanakirja {
    
    private HashMap<String, ArrayList<String>> sanat;
    
    public UseanKaannoksenSanakirja(){
        sanat = new HashMap<>();
    }
    
    public void lisaa(String sana, String kaannos){
        this.sanat.putIfAbsent(sana, new ArrayList<>());
        
        this.sanat.get(sana).add(kaannos);
    }
    
    public ArrayList<String> kaanna(String sana){
        if(this.sanat.get(sana) == null)
            return new ArrayList<String>();
        
        return this.sanat.get(sana);
    }
    
    public void poista(String sana){
        this.sanat.remove(sana);
    }
}
