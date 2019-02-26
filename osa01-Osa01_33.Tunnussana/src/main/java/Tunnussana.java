
import java.util.Scanner;

public class Tunnussana {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Tunnusana?");
        String correct_password = "Caput Draconis";
        String password = lukija.nextLine();
        
        if(password.equals(correct_password))
            System.out.println("Tervetuloa!");
        else
            System.out.println("Hus siitä!");
        // Toteuta ohjelmasi tähän. 
    }
}
