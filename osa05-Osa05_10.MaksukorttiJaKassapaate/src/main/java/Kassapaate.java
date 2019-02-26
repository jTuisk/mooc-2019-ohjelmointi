
public class Kassapaate {


    private double rahaa;  // kassassa olevan käteisen määrä
    private int edulliset; // myytyjen edullisten lounaiden määrä
    private int maukkaat;  // myytyjen maukkaiden lounaiden määrä


    public Kassapaate() {
        this.rahaa = 1000;
    }

    public double syoEdullisesti(double maksu) {
        double price = 2.50;
        if(maksu < price)
            return maksu;
        
        maksu -= price;
        this.rahaa += price;
        this.edulliset ++;
        
        return maksu;
    }

    public boolean syoEdullisesti(Maksukortti kortti){
        double price = 2.50;
        if(!kortti.otaRahaa(price))
            return false;
        
        this.edulliset ++;
        return true;
    }
    public boolean syoMaukkaasti(Maksukortti kortti){
        double price = 4.30;
        if(!kortti.otaRahaa(price))
            return false;
        
        this.maukkaat ++;
        return true;
    }
    public double syoMaukkaasti(double maksu) {
        double price = 4.30;
        if(maksu < price)
            return maksu;
        
        maksu -= price;
        this.rahaa += price;
        this.maukkaat ++;
        
        return maksu;
    }

    public void lataaRahaaKortille(Maksukortti kortti, double summa){
        if(this.rahaa < summa || summa < 0)
            return;
        
        kortti.lataaRahaa(summa);
        this.rahaa +=summa;
    }
    
    @Override
    public String toString() {
        return "kassassa rahaa " + rahaa + " edullisia lounaita myyty " +
               edulliset + " maukkaita lounaita myyty " + maukkaat;
    }
}
