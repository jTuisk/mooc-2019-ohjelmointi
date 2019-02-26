
import java.util.Scanner;

public class Paaohjelma {

    public static void main(String[] args) {
        // HUOM! Älä luo ohjelmassa muita Scanner-olioita. Jos ja toivottavasti
        // kun teet muita luokkia, anna allaoleva Scanner-olio niille
        // tarvittaessa parametrina.

        
        Kayttoliittyma kl = new Kayttoliittyma( new Scanner(System.in), 
                                                new LintuBongaus(new Linnut()));
        kl.run();
        
        
        
    }

}
