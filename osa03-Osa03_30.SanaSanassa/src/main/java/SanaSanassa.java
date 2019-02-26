
import java.util.Scanner;

public class SanaSanassa {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
 
        System.out.println("Anna 1. sana:");
        String word_1 = lukija.nextLine();
        System.out.println("Anna 2. sana:");
        String word_2 = lukija.nextLine();
        
        if(word_1.indexOf(word_2) > -1)
            System.out.println("Sana '"+word_2+"' on sanan '"+word_1+"' osana.");
        else
            System.out.println("Sana '"+word_2+"' ei ole sanan '"+word_1+"' osana.");       
            
    }
}
