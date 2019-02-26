
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<Books> books = new ArrayList();
       
        while (true) {
            System.out.print("Nimi:");
            String nimi = lukija.nextLine();
            
            if (nimi.equals("") || nimi.equals(" "))
                break;
            
            System.out.print("Sivuja:");
            int sivuja = Integer.valueOf(lukija.nextLine());
            System.out.print("Kirjoitusvuosi:");
            int kirjoitusvuosi = Integer.valueOf(lukija.nextLine());
            
            books.add(new Books(nimi,sivuja,kirjoitusvuosi));
        }
        
        System.out.print("Mitä tulostetaan?");
        String input = lukija.nextLine();
        for(Books b : books){
            System.out.println(b.tulostus(input));
        }
    }
}
