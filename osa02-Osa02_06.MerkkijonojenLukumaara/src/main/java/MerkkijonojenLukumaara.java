
import java.util.Scanner;

public class MerkkijonojenLukumaara {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        int strings = 0;
        
        while(true){
            if(lukija.nextLine().equals("loppu"))
                break;
            
            strings ++;
        }
        System.out.println(strings);
    }
}
