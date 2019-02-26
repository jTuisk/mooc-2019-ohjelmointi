/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author janek
 */
public class Lahja {
    private String name;
    private int weight;
    
    public Lahja(String name, int weight){
        this.name = name;
        this.weight = weight;
    }

    public String getNimi() {
        return name;
    }

    public int getPaino() {
        return weight;
    }
    
    @Override
    public String toString(){
        return "Lahja: "+this.name+" ("+this.weight+"kg)";
    }
}
