
import java.util.Scanner;

public class IanTarkistus {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.print("Kuinka vanha olet?");
        int age = Integer.valueOf(lukija.nextLine());
        
        if(age > -1 && age < 121)
            System.out.println("OK");
        else
            System.out.println("Mahdotonta!");
        
    }
}
