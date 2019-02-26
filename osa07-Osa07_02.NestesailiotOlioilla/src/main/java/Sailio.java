/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author janek
 */
public class Sailio {

    private int sisalto;
    private final int max_sisalto = 100, min_sisalto = 0;
    
    public Sailio(){
        this.sisalto = 0;
    }
    
    public int sisalto(){
        return this.sisalto;
    }
    
    public void lisaa(int maara){
        if(maara < 0)
            return;
        
        this.sisalto += maara;
        
        if(this.sisalto > this.max_sisalto)
           this.sisalto = this.max_sisalto;
    }
    
    public void poista(int maara){
        if(maara < 0)
            return;
        
        this.sisalto -= maara;
        
        if(this.sisalto < min_sisalto)
            this.sisalto = min_sisalto;
    }

    public String toString(){
        return (this.sisalto+"/"+this.max_sisalto);
    }
}
