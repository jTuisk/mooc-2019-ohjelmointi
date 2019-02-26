
import java.util.Scanner;

public class PositiivistenLukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        int pos_sum = 0;
        int pos_inputs = 0;
        
        while(true){
            int input = Integer.valueOf(lukija.nextLine());
            
            if(input == 0)
                break;
            
            if(input > 0){
                pos_sum += input;
                pos_inputs ++;
            }
        }
        double average = pos_inputs == 0? 0 : (double)pos_sum/pos_inputs;
        
        if(average == 0)
            System.out.println("keskivarvon laskemin ei ole mahdollista");
        else
            System.out.println(average);
    }
}
