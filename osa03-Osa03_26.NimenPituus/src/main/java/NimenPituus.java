
import java.util.Scanner;

public class NimenPituus {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // kutsu täältä metodiasi
        System.out.println("Anna nimi:");
        int a = laskeKirjaimet(lukija.nextLine());
        
        System.out.println("Kirjainmäärä: "+a);
    }
    
    // tee tänne metodi 
    public static int laskeKirjaimet(String n){
        return n.length();
    }
    
}
