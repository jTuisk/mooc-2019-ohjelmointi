
import java.util.Scanner;

public class LukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int sum = 0, 
            numbers = 0;
        double average = 0;
        
        while(true){
            System.out.println("Syötä luku");
            int input = Integer.valueOf(lukija.nextLine());
            
            if(input == 0)
                break;
 
            sum += input;
            numbers ++;
        }
        average = (double)sum/numbers;
        System.out.println("Lukujen keskiarvo " + average);
    }
}
