
import java.util.HashMap;

public class Lempinimet {

    public static void main(String[] args) {
        // Tee tehtävänannossa pyydetyt operaatiot täällä!
        
        HashMap<String, String> l_nimet = new HashMap();
        
        l_nimet.put("matti", "mage");
        l_nimet.put("mikael", "mixu");
        l_nimet.put("arto", "arppa");
        
        System.out.println(l_nimet.get("mikael"));
    }

}
