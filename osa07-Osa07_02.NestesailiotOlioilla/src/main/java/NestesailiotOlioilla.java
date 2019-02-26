
import java.util.Scanner;

public class NestesailiotOlioilla {
 
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        Sailio s1 = new Sailio();
        Sailio s2 = new Sailio();
 
        while (true) {
                System.out.println("Ensimmäinen: "+s1);
                System.out.println("Toinen: "+s2);
                
            String luettu = lukija.nextLine();
            if (luettu.equals("lopeta")) {
                break;
            }
            
 
            if(luettu.contains("lisaa")){
                luettu = luettu.replace("lisaa", "");
                luettu = luettu.trim();
                
                int maara = Integer.valueOf(luettu);
                
                s1.lisaa(maara);
            }else if(luettu.contains("siirra")){
                luettu = luettu.replace("siirra", "");
                luettu = luettu.trim();
                
                int maara = Integer.valueOf(luettu);
                maara = s1.sisalto() < maara ? s1.sisalto() : maara;
                if(s1.sisalto() < 1)
                    return;
                
                s1.poista(maara);
                s2.lisaa(maara);
            }else if(luettu.contains("poista")){
                luettu = luettu.replace("poista", "");
                luettu = luettu.trim();
                
                int maara = Integer.valueOf(luettu);
                
                s2.poista(maara);
            }
        }
    }
 
}