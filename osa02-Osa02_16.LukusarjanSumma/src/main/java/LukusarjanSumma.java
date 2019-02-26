
import java.util.Scanner;

public class LukusarjanSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        int num = 1;
        int sum = 0;
        
        System.out.println("Mihin asti?");
        int to_num = Integer.valueOf(lukija.nextLine());
        
        while(num <= to_num){
            sum +=num;
            num ++;
        }
        System.out.println("Summa on "+ sum);
    }
}
