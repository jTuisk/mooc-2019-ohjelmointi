
import java.util.Scanner;

public class SilmukatLopetusMuistaminen {

    public static void main(String[] args) {
        // Kyseessä on yksi iso tehtävä jota koko ajan laajennetaan -- tehtävä
        // on viiden yksittäisen tehtäväpisteen arvoinen

        // Voit halutessasi lähettää osittain tehdyn tehtäväsarjan tarkastettavaksi palvelimelle
        // palvelin valittaa tällöin niistä testeistä joita vastaava koodi ei ole vielä
        // kirjoitettu. Jo tehdyt osat kuitenkin kirjautuvat tehdyiksi.
        Scanner lukija = new Scanner(System.in);

        System.out.println("Syötä luvut:");
        
        int sum = 0;
        int inputs = 0;
        
        int even_nums = 0, odd_nums = 0;
        
        while(true){
            int input = Integer.valueOf(lukija.nextLine());
            
            if(input == -1)
                break;
            
            sum += input;
            inputs ++;
            
            if(input % 2 == 0)
                even_nums ++;
            else
                odd_nums ++;
        }
        double average = (double)sum/inputs;
        
        System.out.println("Kiitos ja näkemiin!");
        System.out.println("Summa: "+ sum);
        System.out.println("Lukuja: "+ inputs);
        System.out.println("Keskiarvo: "+ average);
        System.out.println("Parillisia: "+ even_nums);
        System.out.println("Parittomia: "+ odd_nums);
        
    }
}
