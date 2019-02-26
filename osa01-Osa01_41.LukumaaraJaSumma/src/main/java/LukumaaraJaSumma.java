
import java.util.Scanner;

public class LukumaaraJaSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int sum = 0;
        int numbers = 0;
        
        while(true){
            System.out.println("Syötä luku");
            int input = Integer.valueOf(lukija.nextLine());
            
            if(input == 0)
                break;
 
            sum += input;
            numbers ++;
        }
        System.out.println("Lukuja yhteensä " + numbers);
        System.out.println("Lukujen summa " + sum);
    }
}
