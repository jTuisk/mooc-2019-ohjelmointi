/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author janek
 */
import java.util.ArrayList;

public class Kirjasto {
    
    private ArrayList<Kirja> kirjat = new ArrayList();
    
    public Kirjasto(){
        
    }
    
    public void lisaaKirja(Kirja uKirja){
        kirjat.add(uKirja);
    }
    
    public void tulostaKirjat(){
        for(Kirja k : kirjat)
            System.out.println(k);
    }
    
    public ArrayList<Kirja> haeKirjaJulkaisijalla(String jul){
        ArrayList<Kirja> hKirja = new ArrayList();
        
        for(Kirja k : kirjat){
            if(StringUtils.sisaltaa(k.julkaisija(), jul))
                hKirja.add(k);
        }
        
        return hKirja;
    }
    public ArrayList<Kirja> haeKirjaJulkaisuvuodella(int n){
        ArrayList<Kirja> hKirja = new ArrayList();
        
        for(Kirja k : kirjat){
            if(n == k.julkaisuvuosi())
                hKirja.add(k);
        }
        
        return hKirja;
    }
    public ArrayList<Kirja> haeKirjaNimekkeella(String nim){
        ArrayList<Kirja> hKirja = new ArrayList();
        
        for(Kirja k : kirjat){
            if(StringUtils.sisaltaa(k.nimeke(), nim))
                hKirja.add(k);
        }
        
        return hKirja;
    }
}
