
import java.util.Scanner;

public class Wanha {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Anna vuosiluku:");
        int year = Integer.valueOf(lukija.nextLine());
        
        if(year < 2015)
            System.out.println("Wanha!");
        // Toteuta ohjelmasi tähän. 
    }
}
