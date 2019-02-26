/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author janek
 */
public class Laskuri {
    int alkuarvo;
    
    public Laskuri(int alkuarvo){
        this.alkuarvo = alkuarvo;
    }
    
    public Laskuri(){
        this(0);
    }
    
    public int arvo(){
        return this.alkuarvo;
    }
    
    public void lisaa(){
        this.alkuarvo ++; 
    }
    
    public void lisaa(int n){
        if(n < 0)
            return;
        this.alkuarvo += n;
    }
    public void vahenna(){
        this.alkuarvo --;
    }
    
    public void vahenna(int n){
        if(n < 0)
            return;
        this.alkuarvo -= n;
    }
}
