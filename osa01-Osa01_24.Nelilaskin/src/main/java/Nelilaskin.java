
import java.util.Scanner;

public class Nelilaskin {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Syötä ensimmäinen luku!");
        int a = Integer.valueOf(lukija.nextLine());
        
        System.out.println("Syötä toinen luku!");
        int b = Integer.valueOf(lukija.nextLine());
        
        System.out.println(a+" + " + b + " = " +(a+b));
        System.out.println(a+" - " + b + " = " +(a-b));
        System.out.println(a+" * " + b + " = " +(a*b));
        System.out.println(a+" / " + b + " = " +((double)a/b));
        
        
        // toteuta ohjelma tänne

    }
}
