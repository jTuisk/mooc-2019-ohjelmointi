
import java.util.Scanner;

public class SamatSanat {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Syötä ensimmäinen merkkijono:");
        String firstS = lukija.nextLine();
        System.out.println("Syötä toinen merkkijono");
        String secondS = lukija.nextLine();
        
        if(firstS.equals(secondS))
            System.out.println("Samat sanat");
        else
            System.out.println("Ei sitten");
        // Toteuta ohjelmasi tähän. 
    }
}
