
import java.util.Scanner;

public class ArvosanatJaPisteet {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Anna pisteet[0-100]:");
        int points = Integer.valueOf(lukija.nextLine());
        
        String grade;
        
        if(points < 0)
            grade = "mahdotonta!";
        else if(points >= 0 && points < 50)
            grade = "hylätty";
        else if(points >= 50 && points < 60)
            grade = "1";
        else if(points >= 60 && points < 70)
            grade = "2";
        else if(points >= 70 && points < 80)
            grade = "3";
        else if(points >= 80 && points < 90)
            grade = "4";
        else if(points >= 90 && points < 101)
            grade = "5";
        else
            grade = "uskomatonta!";
        
        System.out.println("Arvosana: "+grade);    
    }
}
