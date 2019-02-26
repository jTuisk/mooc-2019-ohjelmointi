/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author janek
 */
import java.util.ArrayList;

public class Resepti {
    
    private String nimi;
    private int keittoaika;
    private ArrayList<String> raaka_aineet;
    
    public Resepti(String nimi, int keittoaika, ArrayList<String> raaka_aineet){
        this.nimi = nimi;
        this.keittoaika = keittoaika;
        this.raaka_aineet = raaka_aineet;
    }
    
    public String getNimi(){
        return this.nimi;
    }
    
    public int getKeittoaika(){
        return this.keittoaika;
    }
    
    public ArrayList<String> getRaakaAineet(){
        return this.raaka_aineet;
    }
    
    
    public String toString(){
        return this.nimi+", keittoaika: "+this.keittoaika;
    }
}
