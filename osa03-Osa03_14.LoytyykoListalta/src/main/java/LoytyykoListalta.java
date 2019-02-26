
import java.util.ArrayList;
import java.util.Scanner;

public class LoytyykoListalta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        ArrayList<String> lista = new ArrayList<>();
        while (true) {
            String luettu = lukija.nextLine();
            if (luettu.equals("")) {
                break;
            }

            lista.add(luettu);
        }
        System.out.println("Ketä etsitään?");
        String looking_for = lukija.nextLine();
        
        Boolean found = false;
        for(String name : lista){
            if(name.equals(looking_for)){
                found = true;
                break;
            }
        }
        if(found)
            System.out.println(looking_for+" löytyi!");
        else
            System.out.println(looking_for+" ei löytnyt!");
    }
}
