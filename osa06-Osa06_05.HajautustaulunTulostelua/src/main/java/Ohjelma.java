
import java.util.HashMap;

public class Ohjelma {

    public static void main(String[] args) {
        // Testaa ohjelmasi toimintaa täällä!
    }

    public static void tulostaAvaimet(HashMap<String, String> ht){
        for(String avain : ht.keySet()){
            System.out.println(avain);
        }
    }
    
    public static void tulostaAvaimetJoissa(HashMap<String, String> ht, String merkkijono){
        for(String avain : ht.keySet()){
            if(avain.contains(merkkijono))
                System.out.println(avain);
        }
    }
    
    public static void tulostaArvotJosAvaimessa(HashMap<String, String> ht, String merkkijono){
        for(String avain : ht.keySet()){
            if(avain.contains(merkkijono)){
                System.out.println(ht.get(avain));
            }
        }
    }
}
