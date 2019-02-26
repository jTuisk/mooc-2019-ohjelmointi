
import java.util.Scanner;

public class KolmenLuvunKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
                  int a, b, c;
        System.out.println("Syötä ensimmäinen luku!");
        a = Integer.valueOf(lukija.nextLine());
        System.out.println("Syötä toinen luku!");
        b = Integer.valueOf(lukija.nextLine());
        System.out.println("Syötä kolmas luku!");
        c = Integer.valueOf(lukija.nextLine());
        double keskiarvo = (double)(a+b+c)/3;
        System.out.println("Syötettyjen lukujen keskiarvo on " + keskiarvo);
        // toteuta ohjelma tänne

    }
}
