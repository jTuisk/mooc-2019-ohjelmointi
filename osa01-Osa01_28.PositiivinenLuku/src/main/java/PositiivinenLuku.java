
import java.util.Scanner;

public class PositiivinenLuku {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        
        System.out.println("Anna luku:");
        int value = Integer.valueOf(lukija.nextLine());
        
        if(value > 0)
            System.out.println("Luku on positiivinen.");
        else
            System.out.println("Luku ei ole positiivinen.");
        
        // Toteuta ohjelmasi tähän. 
    }
}
