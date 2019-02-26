
import java.io.File;
import java.util.Scanner;

public class KysytynTiedostonTulostaminen {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Minkä tiedoston sisältö tulostetaan?");
        String f_name = lukija.nextLine();
        
        try(Scanner file = new Scanner(new File(f_name))){
            while(file.hasNextLine()){
                System.out.println(file.nextLine());
            }
        }catch(Exception e){
            System.out.println(e);
        }

    }
}
