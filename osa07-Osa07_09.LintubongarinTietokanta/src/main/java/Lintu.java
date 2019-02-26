/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author janek
 */

public class Lintu {

    private String nimi, l_nimi;
    
    public Lintu(String nimi, String l_nimi){
        this.nimi = nimi;
        this.l_nimi = l_nimi;
    }
    
    public String getNimi(){
        return this.nimi;
    }
    
    public String getL_nimi(){
        return this.l_nimi;
    }
    
    public String toString(){
        return this.nimi+" ("+this.l_nimi+")";
    }
}
