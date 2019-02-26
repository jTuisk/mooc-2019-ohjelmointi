
import java.util.Scanner;

public class Nestesailiot {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int sailio1 = 0, sailio2 = 0;
        final int max_maara = 100;

        while (true) {
                System.out.println("Ensimmäinen: "+sailio1+"/"+max_maara);
                System.out.println("Toinen: "+sailio2+"/"+max_maara);
            String luettu = lukija.nextLine();
            if (luettu.equals("lopeta")) {
                break;
            }
            

            if(luettu.contains("lisaa")){
                luettu = luettu.replace("lisaa", "");
                luettu = luettu.trim();
                
                int maara = Integer.valueOf(luettu);
                
                if(maara < 0)
                    continue;
                
                sailio1 += maara;
                
                if(sailio1 > max_maara)
                    sailio1 = max_maara;
                
            }else if(luettu.contains("siirra")){
                luettu = luettu.replace("siirra", "");
                luettu = luettu.trim();
                
                int maara = Integer.valueOf(luettu);
                
                if(maara < 0 || sailio1 < 1)
                    continue;
                
                sailio2 += sailio1 < maara ? sailio1 : maara;
                sailio1 -= maara;
                 
                if(sailio1 < 0)
                    sailio1 = 0;
                if(sailio2 > max_maara)
                    sailio2 = max_maara;
                
            }else if(luettu.contains("poista")){
                luettu = luettu.replace("poista", "");
                luettu = luettu.trim();
                
                int maara = Integer.valueOf(luettu);
                
                if(maara < 0)
                    continue;
                
                sailio2 -= maara;
                
                if(sailio2 < 0)
                    sailio2 = 0;
            }
        }
    }

}
