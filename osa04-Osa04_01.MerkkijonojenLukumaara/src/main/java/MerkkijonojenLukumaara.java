
import java.util.ArrayList;
import java.util.Scanner;

public class MerkkijonojenLukumaara {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        int counter = 0;
        
        while(true){
            if(lukija.nextLine().equals("loppu"))
                break;
            counter ++;
        }
        System.out.println(counter);
    }
}
