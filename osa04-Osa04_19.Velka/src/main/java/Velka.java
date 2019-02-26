/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author janek
 */
public class Velka {
    private double saldo, korkokerroin;
    
    public Velka(double saldo, double korkokerroin){
        this.saldo = saldo;
        this.korkokerroin = korkokerroin;
    }
    
    public void tulostaSaldo(){
        System.out.println(saldo);
    }
    
    public void odotaVuosi(){
        this.saldo *= this.korkokerroin;
    }
}
