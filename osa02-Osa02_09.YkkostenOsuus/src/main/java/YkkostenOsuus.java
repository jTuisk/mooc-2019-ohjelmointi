
import java.util.Scanner;

public class YkkostenOsuus {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        int ones = 0, 
            inputs = 0;
        
        while(true){
            int input = Integer.valueOf(lukija.nextLine());
            
            if(input == 0)
                break;
            if(input == 1)
                ones ++;
            
            inputs ++;
        }
        double answer = inputs == 0 ? 0 : (double)ones/inputs;
        
        if(answer == 0)
            System.out.println("ykkösten osuutta ei voida laskea");
        else
            System.out.println(answer);
    }
}
