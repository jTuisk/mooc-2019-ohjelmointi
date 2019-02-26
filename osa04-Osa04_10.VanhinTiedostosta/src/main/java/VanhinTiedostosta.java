
import java.io.File;
import java.util.Scanner;

public class VanhinTiedostosta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

            System.out.println("Mikä tiedosto lueteen?");
            String file_name = lukija.nextLine();
            
            try(Scanner file = new Scanner(new File(file_name))){
                int oldest = -1;
                String name = "";
                while(file.hasNextLine()){
                    String[] data = file.nextLine().split(",");
                    int age = Integer.valueOf(data[1].replace(" ", ""));
                    
                    if(age > oldest){
                        oldest = age;
                        name = data[0];
                    }
                }
                System.out.println("Vanhin oli: "+name);
            } catch(Exception e){
                System.out.println(e);
            }
    }
}
