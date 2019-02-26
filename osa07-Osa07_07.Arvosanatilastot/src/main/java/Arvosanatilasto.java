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

public class Arvosanatilasto {
    
    private HashMap<Integer , Integer> arvosanat;
    private ArrayList<Integer> koepisteet;
    
    public Arvosanatilasto(){
        this.arvosanat = new HashMap<>();
        this.koepisteet = new ArrayList<>();
    }
    
    public void lisaaArvosana(int pisteet){
        int arvosana = pisteetArvosanaksi(pisteet);
        int lkm = this.arvosanat.getOrDefault(arvosana, 0);
        this.arvosanat.put(arvosana, lkm+1);
        this.koepisteet.add(pisteet);
    }
    
    public double pisteidenKeskiarvo(){
        int sum = 0;
        for(Integer a : this.koepisteet){
            sum += a;
        }
        return (sum/this.koepisteet.size());
    } 
    
    public double hyvaksyttyjenPisteidenKeskiarvo(){
        int sum = 0, passed = 0;
        for(Integer a : this.koepisteet){
            if(Apuohjelma.inRangeOf(a, 50, 100)){
                sum += a;
                passed ++;
            }
        }
        return ((double)sum/passed);
    }
    
    public double hyvaksyttyjenProsenttiosuus(){
        int passed = 0;
        for(Integer a : this.koepisteet){
            if(Apuohjelma.inRangeOf(a, 50, 100))
                passed ++;
        }
        return ((double)passed/this.koepisteet.size())*100;
    }
    
    public int montaArvosanaa(int arvosana){
       return this.arvosanat.getOrDefault(arvosana, 0);
    }
    
    public void tulostaArvosanaJakauma(){
        for(int i = 5; i >= 0; i--)
            System.out.println(i+": "+Apuohjelma.printStringTimesInRow("*", this.montaArvosanaa(i)));
    }
    
    public int pisteetArvosanaksi(int p) {
        if (p < 50) {
            return 0;
        } else if (p < 60) {
            return 1;
        } else if (p < 70) {
            return 2;
        } else if (p < 80) {
            return 3;
        } else if (p < 90) {
            return 4;
        } else {
            return 5;
        }
    }
}
