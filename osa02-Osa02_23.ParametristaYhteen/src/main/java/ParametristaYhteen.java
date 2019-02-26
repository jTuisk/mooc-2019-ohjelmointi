
import java.util.Scanner;

public class ParametristaYhteen {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        tulostaLuvustaYhteen(2);
    }

    public static void tulostaLuvustaYhteen(int n){
        for(int i = 1; n >= i; n--){
            System.out.println(n);
        }
    }
}
