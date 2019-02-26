
import java.util.Scanner;

public class LukujenLukumaara {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        int numbers = 0;
        
        while(true){
            System.out.println("Syötä luku");
            
            if(lukija.nextLine().equals("0"))
                break;
            
            numbers ++;
        }
        System.out.println("Lukuja yhteensä " + numbers);
    }
}
