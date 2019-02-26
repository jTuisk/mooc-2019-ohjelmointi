
import java.util.Scanner;

public class KolmellaJaolliset {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

    }

    public static void kolmellaJaollisetValilta(int n1, int n2){
        while(n1 <= n2){
            if(n1 % 3 == 0)
                System.out.println(n1);
            
            n1 ++;
        }
    }
}
