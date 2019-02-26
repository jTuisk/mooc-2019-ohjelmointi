
import java.util.Scanner;

public class LuvustaSataan {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        int from_num = Integer.valueOf(lukija.nextLine());
        
        for(int i = from_num; i < 101; i++){
            System.out.println(i);
        }
    }
}
