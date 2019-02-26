/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author janek
 */
public class Maksukortti {
    
    private double saldo;
    
    public Maksukortti(double saldo){
        this.saldo = saldo;
    }
    
    public void syoEdullisesti(){
        if((this.saldo-2.60) >= 0)
            this.saldo -= 2.60;
    }
    
    public void syoMaukkaasti(){
        if((this.saldo-4.60) >= 0)
            this.saldo -= 4.60;
    }
    
    public void lataaRahaa(double n){
        if(n > 0)
            this.saldo += n;
        if(this.saldo > 150)
            this.saldo = 150;
    }
    
    public String toString(){
        return "Kortilla on rahaa "+this.saldo+" euroa";
    }
}
