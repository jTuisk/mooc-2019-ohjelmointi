
import java.util.Scanner;

public class LukujenSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        int sum = 0;
        
        while(true){
           int input = Integer.valueOf(lukija.nextLine());
           
           if(input == 0)
               break;
           
           sum +=input;
           
        }
        System.out.println(sum);
    }
}
