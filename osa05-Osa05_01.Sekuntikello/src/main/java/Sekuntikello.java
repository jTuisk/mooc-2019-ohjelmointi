/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author janek
 */
public class Sekuntikello {
    private Viisari sadasOsaSekuntti = new Viisari(100);
    private Viisari sekunti = new Viisari(60);
    
    public String toString(){
       return this.sekunti+":"+this.sadasOsaSekuntti;
    }
    
    public void etene(){
        this.sadasOsaSekuntti.etene();
        if(this.sadasOsaSekuntti.arvo() == 0)
            this.sekunti.etene();
    }
}
