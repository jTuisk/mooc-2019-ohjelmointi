
import java.util.Scanner;

public class Salasana {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        String salasana = "porkkana"; // käytä porkkanaa salasanana testejä ajaessasi!

        boolean correctPassword = false;
        
        do {
            System.out.println("Anna salasana:");
            String input = lukija.nextLine();
            
            if(salasana.equals(input))
                correctPassword = true;
            else
                System.out.println("Väärin!");
            
        }while(!correctPassword);
            System.out.println("Oikein!");
            System.out.println("Salaisuus on: znvavbfgv grugl!");
        
        // Toteuta ohjelmasi tähän.
    }
}
