
import java.util.Scanner;

public class NegatiivistenLukujenMaara {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int numbers = 0;
        
        while(true){
            System.out.println("Syötä luku");
            int input = Integer.valueOf(lukija.nextLine());
            
            if(input == 0)
                break;
 
            if(input < 0)
               numbers ++;
        }
        System.out.println("Negatiivisia lukuja yhteensä " + numbers);
    }
}
