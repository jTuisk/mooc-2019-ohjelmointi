
import java.util.Scanner;

public class Paaohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // Tee sovelluksesi tänne -- kannattaa harkita sovelluksen pilkkomista
        // useampaan luokkaan.
        Arvosanatilasto ArvoT = new Arvosanatilasto();
        while(true){
            System.out.println("Syötä yhteispisteet, -1 lopettaa:");
            int input = Integer.valueOf(lukija.nextLine());
            
            if(input == -1)
                break;
            
            if(!Apuohjelma.inRangeOf(input, 0, 100))
                continue;
            
            ArvoT.lisaaArvosana(input);
        }
        
        System.out.println("Pisteiden keskiarvo (kaikki): "+ArvoT.pisteidenKeskiarvo());
        System.out.println("Pisteiden keskiarvo (hyväksytyt): "+ArvoT.hyvaksyttyjenPisteidenKeskiarvo());
        System.out.println("Hyväksymisprosentti: "+ArvoT.hyvaksyttyjenProsenttiosuus());
        System.out.println("Arvosanajakauma:");
        ArvoT.tulostaArvosanaJakauma();
    }
}
