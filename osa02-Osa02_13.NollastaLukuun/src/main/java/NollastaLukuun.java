
import java.util.Scanner;

public class NollastaLukuun {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        int toNum = Integer.valueOf(lukija.nextLine());
        
        for(int i = 0; i <= toNum; i++){
            System.out.println(i);
        }
    }
}
