
import java.util.Scanner;

public class YkkostenLukumaara {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        int ones = 0;
        
        while(true){
            int input = Integer.valueOf(lukija.nextLine());
            
            if(input == 0)
                break;
            
            if(input == 1)
                ones ++;
        }
        System.out.println(ones);
    }
}
