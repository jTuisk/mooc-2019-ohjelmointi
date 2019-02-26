
import java.util.Scanner;

public class Kertoma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        int sum = 1;
        
        System.out.println("Anna luku: ");
        int to_num = Integer.valueOf(lukija.nextLine());
            to_num = to_num == 0 ? 1 : to_num;
        
        for(int i = 1; i <= to_num; i++){
            sum *= i;
        }
        
        System.out.println("Kertoma on "+ sum);
    }
}
