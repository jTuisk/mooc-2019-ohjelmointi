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

public class Linnut {

    public ArrayList<Lintu> linnut;
    
    public Linnut(){
        this.linnut = new ArrayList<>();
    }
    
    public void lisaaLintu(String nimi, String l_nimi){
        linnut.add(new Lintu(nimi, l_nimi));
    }
    
    public Lintu etsiLintu(String nimi){
        Lintu result = null;
        for(Lintu l: linnut){
            if(nimi.equals(l.getNimi()))
                result = l;
        }
        return result;
    }
    
    public ArrayList<Lintu> getLinnut(){
        return this.linnut;
    }
}
