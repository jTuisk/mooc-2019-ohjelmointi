/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author janek
 */
public class Harjoitusapuri {
    private int ika, leposyke;
    
    public Harjoitusapuri(int ika, int leposyke){
        this.ika = ika;
        this.leposyke = leposyke;
    }
    
    public double tavoitesyke(double pM){ //pM = ProsenttiMaksimista
        return ((maksimisyke()-this.leposyke)*(pM) + this.leposyke);
    }
    
    private double maksimisyke(){
        return (206.3-(0.711* this.ika));
    }
}
