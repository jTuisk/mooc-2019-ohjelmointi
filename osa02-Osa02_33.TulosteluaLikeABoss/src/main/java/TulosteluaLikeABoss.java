
public class TulosteluaLikeABoss {

    public static void tulostaTahtia(int maara) {
        // tehtävän osa 1
        String text = "";
        for(int i = 0; i < maara; i++){
            text +="*";
        }
        System.out.println(text);
    }

    public static void tulostaTyhjaa(int maara) {
        // tehtävän osa 1
        for(int i = 0; i < maara; i++){
            System.out.print(" ");
        }
    }

    public static void tulostaKolmio(int koko) {
        // tehtävän osa 2
        for(int i = 1; i <= koko; i++){
                tulostaTyhjaa(koko-i);
                tulostaTahtia(i);
        }
    }

    public static void jouluKuusi(int korkeus) {
        // tehtävän osa 3
        if(korkeus < 4)
            return;
        
        for(int i = 1; i <= korkeus; i++){
                tulostaTyhjaa(korkeus-i);
                tulostaTahtia(i+i-1);
        }
        tulostaTyhjaa(korkeus-2);
        tulostaTahtia(3);
        tulostaTyhjaa(korkeus-2);
        tulostaTahtia(3);
    }

    public static void main(String[] args) {
        // Testit eivät katso main-metodia, voit muutella tätä vapaasti.

        tulostaKolmio(5);
        System.out.println("---");
        jouluKuusi(4);
        System.out.println("---");
        jouluKuusi(10);
    }
}
