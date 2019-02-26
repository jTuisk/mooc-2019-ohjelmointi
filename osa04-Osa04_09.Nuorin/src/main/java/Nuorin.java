import java.util.Arrays;
import java.util.Scanner;

public class Nuorin {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        String name = "";
        int youngest = -1;
        
        while(true){
            String l = lukija.nextLine();
            
            if(l.equals("") || l.equals(" ") || l.equals("loppu"))
                break;
            
            String[] data = l.split(",");
            System.out.println(Arrays.toString(data));
            int age = Integer.valueOf(data[1].replace(" ",""));
            if(youngest > age || name == ""){
                youngest = age;
                name = data[0];
            }
            
        }
        System.out.println("Nuorin oli: "+name);
    }
}
