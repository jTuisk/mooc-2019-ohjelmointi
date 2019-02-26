import java.lang.Math;
import java.util.Scanner;

public class SummanNeliojuuri {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

       int a = Integer.valueOf(lukija.nextLine()),
           b = Integer.valueOf(lukija.nextLine());
       
       double sqrt = Math.sqrt(a+b);
       
        System.out.println(sqrt);
       
    }
}
