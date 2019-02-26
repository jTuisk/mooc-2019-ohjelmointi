
public class Raha {

    private final int euroa;
    private final int senttia;

    public Raha(int euroa, int senttia) {
        if (senttia > 99) {
            euroa = euroa + senttia / 100;
            senttia = senttia % 100;
        }
        this.euroa = euroa;
        this.senttia = senttia;
    }

    public int eurot() {
        return this.euroa;
    }

    public int sentit() {
        return this.senttia;
    }

    public String toString() {
        String nolla = "";
        if (this.senttia < 10) {
            nolla = "0";
        }

        return this.euroa + "." + nolla + this.senttia + "e";
    }

    public Raha plus(Raha lisattava){
        int uusiEuroArvo = (this.euroa+lisattava.euroa);
        int uusiSenttiArvo = (this.senttia+lisattava.senttia);
        Raha current = new Raha(uusiEuroArvo, uusiSenttiArvo);
        return current;
    }
    
    public Raha miinus(Raha vah){
        int uusiEuroArvo = (this.euroa-vah.euroa);
        int uusiSenttiArvo;
        if((this.senttia-vah.senttia) < 0){
            uusiEuroArvo --;
            uusiSenttiArvo = ((this.senttia+100)-vah.senttia);
        }else
            uusiSenttiArvo = (this.senttia-vah.senttia);
        
        if(uusiEuroArvo < 0){
            uusiEuroArvo = 0;
            uusiSenttiArvo = 0;
        }
        
        Raha current = new Raha(uusiEuroArvo, uusiSenttiArvo);
        return current;
    }

    public boolean vahemman(Raha ver){
        if(this.euroa < ver.euroa)
            return true;
        
        if(this.euroa == ver.euroa)
            if(this.senttia < ver.senttia)
                return true;
        
        return false;
    }
}
