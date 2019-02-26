
import java.util.Scanner;

public class RajatunLukusarjanSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        int sum = 0;
        
        System.out.println("Ensimmäinen: ");
        int from_num = Integer.valueOf(lukija.nextLine());
        System.out.println("Viimeinen: ");
        int to_num = Integer.valueOf(lukija.nextLine());
        
        while(from_num <= to_num){
            sum +=from_num;
            from_num ++;
        }
        System.out.println("Summa on "+ sum);
    }
}
