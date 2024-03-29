
import java.io.File;
import java.util.Scanner;

public class MittauksetTiedostosta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.print("Tiedosto? ");
        String tiedosto = lukija.nextLine();
        System.out.print("Alaraja? ");
        int alaraja = Integer.valueOf(lukija.nextLine());
        System.out.print("Yläraja? ");
        int ylaraja = Integer.valueOf(lukija.nextLine());

        int count = 0;
        
        try(Scanner file = new Scanner(new File(tiedosto))){
            while(file.hasNextLine()){
                int value = Integer.valueOf(file.nextLine());
                if(value >= alaraja && value <= ylaraja)
                    count++;
            }
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Lukuja: "+count);
    }

}
