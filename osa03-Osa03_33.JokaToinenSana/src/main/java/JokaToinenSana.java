
import java.util.Scanner;

public class JokaToinenSana {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        while (true) {
            String input = lukija.nextLine();
            if(input.length() < 1 || input.equals(" "))
                break;

            String[] data = input.split(" ");

            for(int i = 1; i < data.length; i += 2){
                System.out.println(data[i]);
            }
        }
    }
}
