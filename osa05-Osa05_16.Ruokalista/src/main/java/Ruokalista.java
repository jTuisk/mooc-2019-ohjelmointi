
import java.util.ArrayList;

public class Ruokalista {

    private ArrayList<String> ateriat;

    public Ruokalista() {
        this.ateriat = new ArrayList<>();
    }

    public void lisaaAteria(String ateria){
        boolean alreadyIn = false;
        for(String a : ateriat){
            if(a.equals(ateria))
                alreadyIn = true;
        }
        if(!alreadyIn)
            this.ateriat.add(ateria);
    }
    
    public void tulostaAteriat(){
        for(String ateria : ateriat){
            System.out.println(ateria);
        }
    }
    
    public void tyhjennaRuokalista(){
        ateriat = new ArrayList<String>();
    }
    
    // toteuta tänne tarvittavat metodit
}
