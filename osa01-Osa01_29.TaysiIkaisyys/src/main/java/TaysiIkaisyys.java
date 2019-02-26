
import java.util.Scanner;

public class TaysiIkaisyys {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Kuinka vanha olet?");
        int age = Integer.valueOf(lukija.nextLine());
        
        if(age > 17)
            System.out.println("Olet täysi-ikäinen!");
        else
            System.out.println("Et ole täsyi-ikäinen!");
        // Toteuta ohjelmasi tähän. 
    }
}
