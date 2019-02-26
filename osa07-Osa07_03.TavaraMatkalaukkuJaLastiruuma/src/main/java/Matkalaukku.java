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
public class Matkalaukku {
    
    private ArrayList<Tavara> tavarat;
    private int max_paino;
    
    public Matkalaukku(int max_paino){
        this.tavarat = new ArrayList<>();
        this.max_paino = max_paino;
    }
    
    public void lisaaTavara(Tavara tavara){
        if(max_paino < (yhteispaino()+tavara.getPaino()))
            return;
        
        this.tavarat.add(tavara);
    }
    
    public void tulostaTavarat(){
        for(Tavara t : tavarat)
            System.out.println(t);
    }
    
    public Tavara raskainTavara(){
        Tavara result = (this.tavarat.size() > 0) ? this.tavarat.get(1) : null;
        if(result == null)
            return result;
        
        for(Tavara t : tavarat){
            if(t.getPaino() > result.getPaino())
                result = t;
        }
        return result;
    }
    
    public int yhteispaino(){
        int result = 0;
        for(Tavara t : tavarat)
            result += t.getPaino();
        
        return result;
    }
    
    public String toString(){
        if(tavarat.size() == 0)
            return "ei tavaroita ("+yhteispaino()+"kg)";
        else if(tavarat.size() == 1)
            return tavarat.size()+" tavara ("+yhteispaino()+"kg)";
        else
            return tavarat.size()+" tavaraa ("+yhteispaino()+"kg)";
    }
}
