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

public class Sanakirja {
    
    private HashMap<String, String> sanat;
    
    public Sanakirja(){
        sanat = new HashMap();
    }
    
    public String kaanna(String sana){
        return this.sanat.get(sana);
    }
    
    public void lisaa(String sana, String kaannos){
        if(this.sanat.get(sana) != null)
            return;
        this.sanat.put(sana, kaannos);
    }
    
    public int sanojenLukumaara(){
        return this.sanat.size();
    }
    
    public ArrayList<String> kaannoksetListana(){
        ArrayList<String> result = new ArrayList<>();
        
        for(String sana : this.sanat.keySet()){
            result.add(sana+" = "+this.sanat.get(sana));
        }
        
        return result;
    }
}
