
import java.util.HashMap;
import java.util.ArrayList;

public class Arvosanarekisteri {

    private HashMap<Integer, Integer> arvosanat;

    private ArrayList<Integer> koepisteet;
    
    public Arvosanarekisteri() {
        this.arvosanat = new HashMap<>();
        this.koepisteet = new ArrayList<>();
    }

    public void lisaaArvosanaPisteidenPerusteella(int pisteet) {
        int arvosana = pisteetArvosanaksi(pisteet);

        int lkm = this.arvosanat.getOrDefault(arvosana, 0);
        this.arvosanat.put(arvosana, lkm + 1);
        this.koepisteet.add(pisteet);
    }

    public int montakoSaanutArvosanan(int arvosana) {
        return this.arvosanat.getOrDefault(arvosana, 0);
    }

    public double koepisteidenKeskiarvo(){
        int sum = 0;
        
        for(int pisteet : koepisteet)
            sum += pisteet;
        
        return ((double)sum/this.koepisteet.size());
    }
    
    public double arvosanojenKeskiarvo(){
        int sum = 0, arvosanoja = 0;
        
        for(int arvosana : this.arvosanat.keySet()){
            sum += (arvosana*this.arvosanat.get(arvosana));
            arvosanoja += this.arvosanat.get(arvosana);
        }
        
        return ((double)sum/arvosanoja);
    }

    public static int pisteetArvosanaksi(int pisteet) {

        int arvosana = 0;
        if (pisteet < 50) {
            arvosana = 0;
        } else if (pisteet < 60) {
            arvosana = 1;
        } else if (pisteet < 70) {
            arvosana = 2;
        } else if (pisteet < 80) {
            arvosana = 3;
        } else if (pisteet < 90) {
            arvosana = 4;
        } else {
            arvosana = 5;
        }

        return arvosana;
    }
}
