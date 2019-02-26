
import java.util.Scanner;

public class Alkuosa {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Anna sana:");
        String input_s = lukija.nextLine();
        
        System.out.println("Alkuosan pituus:");
        int input_i = Integer.valueOf(lukija.nextLine());
        
        System.out.println("Tulos: "+input_s.substring(0, input_i));
    }
}
