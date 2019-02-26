
import java.util.Scanner;

public class Tarina {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        String[] data = new String[2];

        // toteuta ohjelma tänne
        System.out.println("Kerron kohta tarinan, mutta tarvitsen siihen hieman tietoja.\n" +
                            "Minkä niminen tarinassa esiintyvä hahmo on?");
        data[0] = lukija.nextLine();
        
        System.out.println("Mikä hahmon ammatti on?");
        data[1] = lukija.nextLine();
        
        System.out.println("Tässä tarina:\n "+
                            "Olipa kerran "+data[0]+", joka oli ammatiltaan "+data[1]+".\n" +
                            "Matkatessaan töihin, "+data[0]+" mietti arkeaan. Kun työnä\n" +
                            "on "+data[1]+", tekemistä riittää välillä hyvin paljon ja\n" +
                            "välillä ei lainkaan. Ehkäpä "+data[0]+" ei olekaan koko\n" +
                            "elämäänsä "+data[1]+".");

    }
}
