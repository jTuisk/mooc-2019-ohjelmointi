
import java.util.ArrayList;
import java.util.Scanner;

public class HenkilotietojenTarkastelu {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        ArrayList<String> data = new ArrayList<String>();
        
        while(true){
            String input = lukija.nextLine();
            
            if(input.equals("") || input.equals(" "))
                break;
            
                data.add(input);
        }
        
        String l_name = "";
        int sum_year = 0;
        
        for(int i = 0; i < data.size(); i++){
            String[] info = data.get(i).split(",");
            if(l_name.length() < info[0].length()){
                l_name = info[0];
            }
            
            sum_year += Integer.valueOf(info[1].replace(" ", ""));
        }
        
        System.out.println("Pisin nimi: "+l_name);
        System.out.println("Syntymävuosien keskiarvo: "+((double)sum_year/data.size()));
    }
}
