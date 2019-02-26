
public class VahenevaLaskuri {

    private int arvo, arvo2;  // oliomuuttuja joka muistaa laskurin arvon
    public VahenevaLaskuri(int arvoAlussa) {
        this.arvo = arvoAlussa;
        this.arvo2 = this.arvo;
    }

    public void tulostaArvo() {
        // älä koske tässä olevaan koodiin!
        System.out.println("arvo: " + this.arvo);
    }

    public void vahene() {
        if(this.arvo > 0)
            this.arvo--;
    }

    public void nollaa(){
        this.arvo = 0;
    }
    
    public void palautaAlkuarvo(){
        this.arvo = this.arvo2;
    }
    // ja tänne muut metodit
}
