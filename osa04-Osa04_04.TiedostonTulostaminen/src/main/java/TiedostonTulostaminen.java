
import java.io.File;
import java.util.Scanner;

public class TiedostonTulostaminen {

    public static void main(String[] args) {

        try(Scanner file = new Scanner(new File("data.txt"))) {
            while(file.hasNextLine()){
                String line = file.nextLine();
                System.out.println(line);
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
