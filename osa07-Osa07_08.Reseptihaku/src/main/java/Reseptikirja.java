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
import java.util.Scanner;
import java.io.File;
import java.util.Arrays;

public class Reseptikirja {
    
    private ArrayList<Resepti> reseptit;
    
    public Reseptikirja(){
        reseptit = new ArrayList<>();
    }
    
    public void haeReseptejä(String tiedosto){
        try(Scanner file = new Scanner(new File(tiedosto))){
            ArrayList<String> resepti_data = new ArrayList<>();
            while(file.hasNextLine()){ 
                String input = file.nextLine();
                if(input.equals("") || input.equals(" ")){
                    lisaaResepti(resepti_data);
                    resepti_data.clear();
                    continue;
                }
                resepti_data.add(input);
                    
            }
            if(resepti_data.size() > 0)
                lisaaResepti(resepti_data);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void lisaaResepti(ArrayList<String> resepti_data){
        String nimi = resepti_data.get(0);
        int keittoaika = Integer.valueOf(resepti_data.get(1));
        ArrayList<String> raakaAineet = new ArrayList<>();

        for(int i = 2; i < resepti_data.size(); i++){
            raakaAineet.add(resepti_data.get(i));
        }

        this.reseptit.add(new Resepti(nimi, keittoaika, raakaAineet));        
    }
    
    public void tulostaKaikkiReseptit(){
        for(Resepti resepti : this.reseptit){
            System.out.println(resepti);
        }
    }
    
    public void haeNimellaResepteja(String nimi){
        for(Resepti resepti : this.reseptit){
            if(resepti.getNimi().contains(nimi))
                System.out.println(resepti);
        }
    }
    
    public void haeKeittoajallaResepteja(int aika){
        if(aika < 0)
            return;
        for(Resepti resepti : this.reseptit){
            if(resepti.getKeittoaika() <= aika)
                System.out.println(resepti);
        }
    }
    
    public void haeRaakaaineellaResepteja(String raakaaine){
        for(Resepti resepti : this.reseptit){
            ArrayList<String> aineet = resepti.getRaakaAineet();
            for(String aine : aineet){
                if(aine.equals(raakaaine)){
                    System.out.println(resepti);
                    break;
                }
            }
        }
    }
}
