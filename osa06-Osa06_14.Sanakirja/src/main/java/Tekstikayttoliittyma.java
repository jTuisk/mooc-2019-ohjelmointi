/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author janek
 */
import java.util.Scanner;

public class Tekstikayttoliittyma {

    private Scanner scanner;
    private Sanakirja sanakirja;
    
    public Tekstikayttoliittyma(Scanner scanner, Sanakirja sanakirja){
        this.scanner = scanner;
        this.sanakirja = sanakirja;
    }
    
    public void kaynnista(){
        System.out.println("Komennot:");
        System.out.println("lisaa - lisää sanaparin sanakirjaan");
        System.out.println("kaanna - kysyy sanan ja tulostaa sen käännöksen");
        System.out.println("lopeta - poistuu käyttöliittymästä");
        
        while(true){
            String nextLine = scanner.nextLine();
            
            if(nextLine.equals("lopeta"))
                break;
            
            if(nextLine.equals("lisaa")){
                System.out.println("Suomeksi: ");
                String suomeksi = scanner.nextLine();
                System.out.println("Käännös");
                String englanniksi = scanner.nextLine();
                
                sanakirja.lisaa(suomeksi, englanniksi);
                
            }else if(nextLine.equals("kaanna")){
                System.out.println("Anna sana: ");
                String sana = scanner.nextLine();
                
                System.out.println("Käännös: "+sanakirja.kaanna(sana));
                
            }else
                System.out.println("Tuntematon komento;");
        }
    }
}
