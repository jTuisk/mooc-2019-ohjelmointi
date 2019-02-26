/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author janek
 */
public class Elokuva {
    
    private String name;
    private int age_limit;
    
    public Elokuva(String name, int age_limit){
        this.name = name;
        this.age_limit = age_limit;
    }
    
    public String nimi(){
        return this.name;
    }
    
    public int ikaraja(){
        return this.age_limit;
    }
}
