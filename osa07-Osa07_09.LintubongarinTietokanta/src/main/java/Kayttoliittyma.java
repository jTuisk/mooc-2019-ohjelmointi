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

public class Kayttoliittyma {
    
    private Scanner scanner;
    private LintuBongaus lintuB;
    
    public Kayttoliittyma(Scanner scanner, LintuBongaus lb){
        this.scanner = scanner;
        this.lintuB = lb;
    }
    
    public void run(){
        while(true){
            String input = Apuohjelma.AskAndGet("?", scanner);
            
            if(input.equals("Lopeta"))
                break;
            
            if(input.equals("Lisaa")){
                String nimi = Apuohjelma.AskAndGet("Nimi: ", scanner);
                String l_nimi = Apuohjelma.AskAndGet("Latinankielinen nimi: ", scanner);
                this.lintuB.getLinnut().lisaaLintu(nimi, l_nimi);
            }else if(input.equals("Havainto")){
                String nimi = Apuohjelma.AskAndGet("Mikä havaittu? ", scanner);
                this.lintuB.lisaaHavainto(nimi);
            }else if(input.equals("Tilasto")){
                this.lintuB.tulosta();
            }else if(input.equals("Nayta")){
                String nimi = Apuohjelma.AskAndGet("Mikä?", scanner);
                this.lintuB.tulosta(nimi);
            }else{
                continue;
            }
        }
    }
}
