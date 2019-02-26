/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author janek
 */
public class Musiikkikappale {
    
    private String name;
    private int length;
    
    public Musiikkikappale(String name, int length){
        this.name = name;
        this.length = length;
    }
    
    public String nimi(){
        return this.name;
    }
    public int pituus(){
        return length;
    }
}
