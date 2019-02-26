
public class Tulostelua {

    public static void main(String[] args) {

        // Testit eivät katso main-metodia, voit muutella tätä vapaasti.
        // HUOM: jos testit eivät meinaa mennä läpi, kokeile pääohjelmaa ajamalla,
        // että metodit toimivat niinkuin niiden on tarkoitus toimia!
        tulostaTahtia(3);
        System.out.println("\n---");  // tulostetaan kuvioiden välille ---
        tulostaNelio(4);
        System.out.println("\n---");
        tulostaSuorakulmio(5, 6);
        System.out.println("\n---");
        tulostaKolmio(3);
        System.out.println("\n---");
    }

    public static void tulostaTahtia(int maara) {
        // tehtävän ensimmäinen osa
        String text = "";
        for(int i = 0; i < maara; i++){
            text +="*";
        }
        System.out.println(text);
    }

    public static void tulostaNelio(int sivunpituus) {
        // tehtävän toinen osa
        for(int i = 0; i < sivunpituus; i++){
            String text = "";
            for(int j = 0; j < sivunpituus; j++){
                text +="*";
            }
            System.out.println(text);
        }
    }

    public static void tulostaSuorakulmio(int leveys, int korkeus) {
        // tehtävän kolmas osa
        for(int i = 0; i < korkeus; i++){
            String text = "";
            for(int j = 0; j < leveys; j++){
                text +="*";
            }
            System.out.println(text);
        }
    }

    public static void tulostaKolmio(int koko) {
        // tehtävän neljäs osa
        for(int i = 0; i < koko; i++){
            String text = "";
            for(int j = 0; j <= i; j++){
                text +="*";
            }
            System.out.println(text);
        }
    }
}
