
import java.util.ArrayList;
import java.util.Scanner;

public class PienimmanLuvunIndeksi {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // toteuta tänne ohjelma, joka lukee käyttäjältä lukuja
        // kunnes käyttäjä syöttää luvun 9999 
        ArrayList<Integer> nums = new ArrayList<>();
        
        while(true){
            int input = Integer.valueOf(lukija.nextLine());
            
            if(input == 9999)
                break;
            
            nums.add(input);
        }
        
        // tämän jälkeen ohjelma tulostaa pienimmän luvun
        // sekä sen indeksin -- pienin luku voi esiintyä
        // useammassa indeksissä
        
        int smallest = nums.get(0);
        
        for(int num : nums){
            if(smallest > num)
                smallest = num;
        }
        System.out.println("Pienin luku on "+smallest);
        
        for(int i = 0; i < nums.size(); i++){
            if(smallest == nums.get(i))
                System.out.println("Pienin luku löytyy indeksistä "+i);
        }
    }
}
