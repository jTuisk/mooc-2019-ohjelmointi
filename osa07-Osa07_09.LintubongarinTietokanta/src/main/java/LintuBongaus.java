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

public class LintuBongaus {

    private HashMap<Lintu, Integer> havainnot;
    private Linnut linnut;
    
    public LintuBongaus(Linnut linnut){
        this.havainnot = new HashMap<>();
        this.linnut = linnut;
    }
    
    public Linnut getLinnut(){
        return this.linnut;
    }
    
    public int havaintoja(Lintu lintu){
        return this.havainnot.getOrDefault(lintu, 0);
    }
    
    public void lisaaHavainto(String havainto){
        Lintu lintu = linnut.etsiLintu(havainto);
        if(lintu == null){
            System.out.println("Ei ole lintu!");
            return;
        }
        int bongaukset = havaintoja(lintu);
        this.havainnot.put(lintu, bongaukset+1);
    }
    
    public void tulosta(){
        for(Lintu l : this.linnut.getLinnut()){
            System.out.println(l+": "+havaintoja(l)+" havaintoa");
        }
    }
    
    public void tulosta(String nimi){
        for(Lintu l : this.linnut.getLinnut()){
            if(l.getNimi().equals(nimi))
            System.out.println(l+": "+havaintoja(l)+" havaintoa");
        }        
    }
    
}
