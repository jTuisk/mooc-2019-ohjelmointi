/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author janek
 */
public class Henkilo {

    private String name;
    private int age;
    
    public Henkilo(String name){
        this.name = name;
    }
    
    public void tulostaHenkilo(){
        System.out.println(this.name+", ikä "+age+" vuotta");
    }
    
    public void vanhene(){
        age ++;
    }
    public int palautaIka(){
        return age;
    }
}
