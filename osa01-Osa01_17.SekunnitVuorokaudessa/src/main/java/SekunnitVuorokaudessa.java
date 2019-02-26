
import java.util.Scanner;

public class SekunnitVuorokaudessa {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Kuinka monen vuorokauden sekunnit tulostetaan?");
        int days = Integer.valueOf(lukija.nextLine());
        System.out.println(24*60*60*days);
        // toteuta ohjelma tänne

    }
}
