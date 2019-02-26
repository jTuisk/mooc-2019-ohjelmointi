
import java.util.Scanner;

public class Paaohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // voit tehdä testikoodia tänne
        // poista kaikki ylimääräinen koodi kuitenkin tehtävän viimeisiä osia tehdessäsi

        // Jotta testi toimisi, on oliot luotava pääohjelmassa oikeassa järjestyksessä 
        //  eli ensin kaikkien summan laskeva olio, toisena parillisten summan laskeva 
        //  ja viimeisenä parittomien summan laskeva olio)!
        Lukutilasto lk = new Lukutilasto();
        
        System.out.println("Anna lukuja:");
        while(true) {
            int input = Integer.valueOf(lukija.nextLine());
            
            if(input == -1)
                break;
            
            lk.lisaaLuku(input);
            
        }
        System.out.println("Summa: "+lk.summa());
    }
}
