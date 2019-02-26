/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author janek
 */
public class StringUtils {
    
    public static boolean sisaltaa(String sana, String haettava){
        sana = sana.toUpperCase();
        sana = sana.trim();
        haettava = haettava.toUpperCase();
        haettava = haettava.trim();
        
        if(sana.contains(haettava))
            return true;
        return false;
    }
}
