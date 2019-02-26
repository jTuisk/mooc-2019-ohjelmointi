
import java.util.HashMap;

public class Ohjelma {

    public static void main(String[] args) {
        // Testaa ohjelmasi toimintaa täällä!
    }

    public static void tulostaArvot(HashMap<String, Kirja> hm){
        for(Kirja k : hm.values()){
            System.out.println(k);
        }
    }
    
    public static void tulostaArvoJosNimessa(HashMap<String, Kirja> hm, String merkkijono){
        for(Kirja k : hm.values()){
            if(k.getNimi().contains(merkkijono))
                System.out.println(k);
        }
    }
}
