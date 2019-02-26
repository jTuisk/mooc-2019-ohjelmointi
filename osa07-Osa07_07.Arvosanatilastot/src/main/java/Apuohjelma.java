/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author janek
 */
public class Apuohjelma {
    
    public static boolean inRangeOf(int n, int min, int max){
        if((n >= min) && (n <= max))
            return true;
        return false;
    }
    
    public static String printStringTimesInRow(String str, int times){
        String finalString = "";
        for(int i = 0; i < times; i++)
            finalString += str;
        return finalString;
    }
}
