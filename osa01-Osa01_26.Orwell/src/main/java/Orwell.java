
import java.util.Scanner;

public class Orwell {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Anna luku:");
        int value = Integer.valueOf(lukija.nextLine());
        
        if(value == 1984)
            System.out.println("Orwell");
        // Toteuta ohjelmasi tähän. 
    }
}
