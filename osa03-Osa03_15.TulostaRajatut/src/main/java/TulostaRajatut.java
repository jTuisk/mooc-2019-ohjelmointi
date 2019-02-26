
import java.util.ArrayList;

public class TulostaRajatut {

    public static void main(String[] args) {
        // kokeile toteuttamasi metodin toimintaa täällä
    }
    
    
    public static void tulostaRajatutLuvut(ArrayList<Integer> luvut, int alaraja, int yleraja){
        for(int luku : luvut){
            if(luku >= alaraja && luku <= yleraja){
                System.out.println(luku);
            }
        }
    }

}
