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

public class Lastiruuma {
    
    private ArrayList<Matkalaukku> laukut;
    private int max_paino;
    
    public Lastiruuma(int max_paino){
        this.laukut = new ArrayList<>();
        this.max_paino = max_paino;
    }
    
    public void lisaaMatkalaukku(Matkalaukku laukku){
        if(max_paino < (yhteispaino()+laukku.yhteispaino()))
            return;
        
        laukut.add(laukku);
    }

    public int yhteispaino(){
        int result = 0;
        for(Matkalaukku ml : laukut)
            result += ml.yhteispaino();
        
        return result;
    }
    
    public void tulostaTavarat(){
        for(Matkalaukku ml : laukut){
            ml.tulostaTavarat();
        }
    }
    
    public String toString(){
        return laukut.size()+" matkalaukkua("+yhteispaino()+"kg)";
    }
}
