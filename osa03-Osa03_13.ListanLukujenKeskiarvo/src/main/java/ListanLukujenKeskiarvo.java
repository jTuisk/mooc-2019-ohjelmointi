
import java.util.ArrayList;
import java.util.Scanner;

public class ListanLukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        ArrayList<Integer> nums = new ArrayList<>();
        
        while(true){
            int input = Integer.valueOf(lukija.nextLine());
            
            if(input == -1)
                break;
            
            nums.add(input);
        }
        int sum = 0;
        for(int num : nums)
            sum +=num;
        
        double average = (double)sum/nums.size();
        
        System.out.println("Keskiarvo: "+average);
        // toteuta tänne ohjelma, joka ensin lukee käyttäjältä
        // lukuja listalle kunnes käyttäjä syöttää luvun -1.
        // ohjelma laskee tämän jälkeen listalla olevien lukujen
        // keskiarvon, ja tulostaa sen käyttäjän näkyville
    }
}
