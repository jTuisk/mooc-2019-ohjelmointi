
import java.util.Scanner;

public class OnkoTotta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Kirjoita merkkijono:");
        String input = lukija.nextLine();
        
        if(input.equals("totta"))
            System.out.println("Oikein meni!");
        else
            System.out.println("Koitappa uudelleen!");
    }
}
