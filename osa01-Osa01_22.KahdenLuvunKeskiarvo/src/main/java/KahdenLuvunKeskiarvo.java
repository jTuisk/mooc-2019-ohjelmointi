
import java.util.Scanner;

public class KahdenLuvunKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
                  int a, b;
        System.out.println("Syötä ensimmäinen luku!");
        a = Integer.valueOf(lukija.nextLine());
        System.out.println("Syötä toinen luku!");
        b = Integer.valueOf(lukija.nextLine());
        double keskiarvo = (double)(a+b)/2;
        System.out.println("Syötettyjen lukujen keskiarvo on " + keskiarvo);
        // toteuta ohjelma tänne

    }
}
