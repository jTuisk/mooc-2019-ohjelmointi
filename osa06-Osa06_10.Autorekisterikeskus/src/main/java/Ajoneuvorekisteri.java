/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author janek
 */

import java.util.HashMap;

public class Ajoneuvorekisteri {
    
    private HashMap<Rekisterinumero, String> rekisteri; 
    
    public Ajoneuvorekisteri(){
        this.rekisteri = new HashMap<>();
    }
    
    public boolean lisaa(Rekisterinumero rekkari, String omistaja){
        if(hae(rekkari) != null)
            return false;
        
        this.rekisteri.put(rekkari, omistaja);
        
        return true;
    }
    
    public boolean poista(Rekisterinumero rekkari){
        if(hae(rekkari) == null)
            return false;
        
        this.rekisteri.remove(rekkari);
        return true;
    }
    
    public String hae(Rekisterinumero rekkari){
        return this.rekisteri.getOrDefault(rekkari, null);
    }

    public void tulostaRekisterinumerot(){
        for(Rekisterinumero rek : this.rekisteri.keySet()){
            System.out.println(rek);
        }
    }
    
    public void tulostaOmistajat(){
        HashMap<String, String> m_omistajat = new HashMap<>();
        for(String omi : this.rekisteri.values()){
            if(!m_omistajat.containsKey(omi))
                m_omistajat.put(omi, omi);
        }
        for(String m_omi : m_omistajat.keySet())
            System.out.println(m_omi);
    }
}
