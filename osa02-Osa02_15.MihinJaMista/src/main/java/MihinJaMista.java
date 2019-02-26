
import java.util.Scanner;

public class MihinJaMista {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Mihin asti?");
        int to_num = Integer.valueOf(lukija.nextLine());
        
        System.out.println("Mistä lähtien?");
        int start_num = Integer.valueOf(lukija.nextLine());
        
        for(int i = start_num; i <= to_num; i++){
            System.out.println(i);
        }
        
        
        // KIRJOITA OHJELMASI TÄNNE
    }
}
