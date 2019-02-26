
import java.util.Scanner;

public class TietoaLuvuista {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int a = Integer.valueOf(lukija.nextLine()),
            b = Integer.valueOf(lukija.nextLine());
        
        if(a == b)
            System.out.println("Luku " + a + " on yhtä suuri kuin luku " + b + ".");
        else if(a > b)
            System.out.println("Luku " + a + " on suurempi kuin luku " + b + ".");
        else
            System.out.println("Luku " + a + " on pienempi kuin luku " + b + ".");
    }
}
