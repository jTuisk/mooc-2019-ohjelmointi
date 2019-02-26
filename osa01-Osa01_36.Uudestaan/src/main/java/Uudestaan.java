
import java.util.Scanner;

public class Uudestaan {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        while(true){
            System.out.println("Syötä luku");
            
            if(Integer.valueOf(lukija.nextLine()) == 4)
                break;
        }
    }
}
