
import java.util.Scanner;

public class HipHipHurraa {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        while(true){
            String response = lukija.nextLine();
            
            if(response.equals("lopeta")){
                System.out.println("hurraa!");
                break;
            }
            
            System.out.println("hip!");
        }
    }
}
