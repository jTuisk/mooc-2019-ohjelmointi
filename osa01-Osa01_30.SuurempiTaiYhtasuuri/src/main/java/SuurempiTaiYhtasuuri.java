
import java.util.Scanner;

public class SuurempiTaiYhtasuuri {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Anna ensimmäinen luku:");
        int a = Integer.valueOf(lukija.nextLine());
        
        System.out.println("Anna toinen luku:");
        int b = Integer.valueOf(lukija.nextLine());
        
        if(a == b)
            System.out.println("Luvut ovat yhtä suuret!");
        else{
            System.out.print("Suurempi luku: ");
            if(a > b)
                System.out.println(a);
            else
                System.out.println(b);
        }
    }
}
