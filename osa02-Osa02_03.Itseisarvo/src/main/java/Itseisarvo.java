
import java.util.Scanner;

public class Itseisarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        int value = Integer.valueOf(lukija.nextLine());
        
        if(value < 0)
            value *= -1;
        
        System.out.println(value);
    }
}
