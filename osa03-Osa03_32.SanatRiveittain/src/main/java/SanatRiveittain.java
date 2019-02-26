
import java.util.Scanner;

public class SanatRiveittain {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        while(true){
            String input = lukija.nextLine();
            if(input.length() < 1 || input.equals(" "))
                break;

            String[] data = input.split(" ");

            for(String i : data){
                System.out.println(i);
            }
        }
    }
}
