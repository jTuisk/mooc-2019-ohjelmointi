/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author janek
 */
public class Tuote {
    private String name;
    private int amo;
    private double price;
    
    public Tuote(String name, double price, int amo){
        this.name = name;
        this.amo = amo;
        this.price = price;
    }
    
    public void tulostaTuote(){
        System.out.println(this.name+", hinta "+price+", "+amo+" kpl");
    }
}
