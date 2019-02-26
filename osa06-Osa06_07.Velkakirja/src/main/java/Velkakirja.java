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
public class Velkakirja {
    private final HashMap<String, Double> velat;
    
    public Velkakirja(){
        this.velat = new HashMap<>();
    }
    
    public void asetaLaina(String kenelle, double maara){
        double velkaa = this.velat.getOrDefault(kenelle, maara);
        this.velat.put(kenelle, maara);
    }
    
    public double paljonkoVelkaa(String kuka){
        return this.velat.getOrDefault(kuka, 0.0);
    }
}
