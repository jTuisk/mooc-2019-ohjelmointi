
import java.util.Scanner;

public class KahdenLuvunSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        int a, b;
        System.out.println("Syötä ensimmäinen luku!");
        a = Integer.valueOf(lukija.nextLine());
        System.out.println("Syötä toinen luku!");
        b = Integer.valueOf(lukija.nextLine());
        System.out.println("Lukujen summa on " + (a + b));
        // toteuta ohjelma tänne

    }
}
