
import java.util.Scanner;

public class SyotteidenRajaus {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        while(true){
            System.out.println("Syötä luku");
            
            int value = Integer.valueOf(lukija.nextLine());
            
            if(value == 0)
                break;
            
            if(value < 0){
                System.out.println("Epäkelpo luku");
                continue;
            }
            
            System.out.println(value*value);
            
        }
    }
}
