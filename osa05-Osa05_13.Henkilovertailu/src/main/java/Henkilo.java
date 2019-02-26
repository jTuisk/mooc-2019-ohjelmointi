
import java.util.Objects;

public class Henkilo {

    private String nimi;
    private Paivays syntymaPaiva;
    private int pituus;
    private int paino;

    public Henkilo(String nimi, Paivays syntymaPaiva, int pituus, int paino) {
        this.nimi = nimi;
        this.syntymaPaiva = syntymaPaiva;
        this.pituus = pituus;
        this.paino = paino;
    }

    @Override
    public boolean equals(Object ob){
        if(this == ob)
            return true;
        
        if(!(ob instanceof Henkilo))
            return false;
        
        Henkilo ver = (Henkilo) ob;
        
        if(this.nimi == ver.nimi &&
           this.paino == ver.paino &&
           this.pituus == ver.pituus &&
           this.syntymaPaiva.equals(ver.syntymaPaiva))
            return true;
        
        return false;
    }
    
    // toteuta tänne equals-metodi, jolla tarkastellaan olioiden samuutta
}
