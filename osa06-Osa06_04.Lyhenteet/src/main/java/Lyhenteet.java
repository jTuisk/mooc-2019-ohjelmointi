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

public class Lyhenteet {
    
    private HashMap<String, String> lyhenteet;
    
    public Lyhenteet(){
        this.lyhenteet = new HashMap<>();
    }
    
    public void lisaaLyhenne(String lyh, String sel){
        lyh = cleanString(lyh);
        sel = cleanString(sel);
        
        this.lyhenteet.put(lyh, sel);
    }
    
    public String haeLyhenne(String lyh){
        lyh = cleanString(lyh);
        return this.lyhenteet.get(lyh);
    }
    public boolean onkoLyhennetta(String lyh){
        lyh = cleanString(lyh);
        return this.lyhenteet.containsKey(lyh);
    }
    
    public String cleanString(String s){
        s = s.toLowerCase();
        return s.trim();
    }
}
