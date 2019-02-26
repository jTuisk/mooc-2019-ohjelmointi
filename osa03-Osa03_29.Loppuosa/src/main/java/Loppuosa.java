import java.util.Scanner;

public class Loppuosa {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
       System.out.println("Anna sana:");
        String input_s = lukija.nextLine();
        
        System.out.println("Loppuosan pituus:");
        int input_i = Integer.valueOf(lukija.nextLine());
        
        System.out.println("Tulos: "+input_s.substring(input_s.length()-input_i, input_s.length()));
    }
}
