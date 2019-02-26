
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // toteuta luokkaa TelevisioOhjelma käyttävä ohjelmasi tänne

        ArrayList<TelevisioOhjelma> ohjelmat = new ArrayList<>();
        Scanner lukija = new Scanner(System.in);
        
        while(true){
            System.out.println("Nimi: ");
            String name = lukija.nextLine();
            if(name.equals("") || name.equals(" "))
                break;
            
            System.out.println("Pituus: ");
            int length = Integer.valueOf(lukija.nextLine());
            
            ohjelmat.add(new TelevisioOhjelma(name, length));
        }
        
        System.out.println("Ohjelman maksimipituus?");
        int max_length = Integer.valueOf(lukija.nextLine());
        for(TelevisioOhjelma TO : ohjelmat){
            if(TO.getPituus() <= max_length)
                System.out.println(TO);
        }
    }
}
