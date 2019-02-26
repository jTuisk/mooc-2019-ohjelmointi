
import java.io.File;
import java.util.Scanner;

public class LoytyykoTiedostosta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Minkä niminen tiedosto luetaan? ");
        String tiedosto = lukija.nextLine();

        System.out.println("Mitä etsitään?");
        String etsittava = lukija.nextLine();
        boolean nameFound = false;
        try(Scanner file = new Scanner(new File(tiedosto))){
            while(file.hasNextLine()){
                if(file.nextLine().equals(etsittava)){
                    nameFound = true;
                    break;
                }
            }
            if(nameFound)
                System.out.println("Löytyi!");
            else
                System.out.println("Ei löytynyt.");
        }catch(Exception e){
            System.out.println("Tiedoston "+tiedosto+" lukeminen epäonnistui.");
        }
    }
}
