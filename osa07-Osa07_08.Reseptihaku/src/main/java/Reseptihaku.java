
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Reseptihaku {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        Reseptikirja r = new Reseptikirja();
        
        System.out.println("Mistä luetaan?"); 
        r.haeReseptejä(lukija.nextLine());
        
        System.out.println("Kommennot:");
        System.out.println("listaa - listaa reseptit");
        System.out.println("lopeta - lopettaa ohjelman");
        System.out.println("hae nimi - hakee reseptiä nimen persuteella");
        System.out.println("hae keittoaika - hakee reseptiä keittoajan persuteella");
        System.out.println("hae aine - hakee reseptiä raaka-aineen perusteella");
        
        while(true){
            System.out.println("Syötö komento: ");
            String input = lukija.nextLine();
            
            if(input.equals("lopeta"))
                break;
            
            if(input.equals("listaa")){
                r.tulostaKaikkiReseptit();
            }else if(input.contains("hae")){
                String hae = input.replace("hae ", "");
                hae = hae.trim();
                if(hae.equals("nimi")){
                    System.out.println("Mitä haetaan:");
                    r.haeNimellaResepteja(lukija.nextLine());
                }else if(hae.equals("keittoaika")){
                    System.out.println("Keittoaika korkeintaan:");
                    r.haeKeittoajallaResepteja(Integer.valueOf(lukija.nextLine()));
                }else if(hae.equals("aine")){
                    System.out.println("Mitä raaka-ainetta haetaan:");
                    r.haeRaakaaineellaResepteja(lukija.nextLine());
                }
            }
        }
    }
}
