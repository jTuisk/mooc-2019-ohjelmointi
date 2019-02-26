
import java.util.Scanner;

public class Kayttajatunnukset {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        String[][] users = {    {"aleksi", "tappara"},
                                {"elina", "kissa"}
                             };
        
        System.out.println("Anna tunnus:");
        String username = lukija.nextLine();
        System.out.println("Anna salana:");
        String password = lukija.nextLine();
        boolean login = false;
        for(int i = 0; i < users.length; i++){
            if(users[i][0].equals(username) && users[i][1].equals(password)){
                login = true;
                System.out.println("Olet kirjautunut järjestelmään");
                break;
            }
        }
        if(!login)
            System.out.println("Virheellinen tunnus tai salasana!");
    }
}
