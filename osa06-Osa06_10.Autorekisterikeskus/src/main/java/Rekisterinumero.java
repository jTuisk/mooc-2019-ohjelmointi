
import java.util.Objects;

public class Rekisterinumero {
    // älä muuta luokan jo valmiina olevia osia

    // oliomuuttujille on lisätty määre final, jolloin niiden arvoa ei asetuksen
    // jälkeen voi enää muuttaa
    private final String rekNro;
    private final String maa;

    public Rekisterinumero(String maa, String rekNro) {
        this.rekNro = rekNro;
        this.maa = maa;
    }

    @Override
    public String toString() {
        return maa + " " + rekNro;
    }

    @Override
    public boolean equals(Object ob){
        if(this == ob)
            return true;
        
        if(!(ob instanceof Rekisterinumero))
            return false;
        
        Rekisterinumero ver = (Rekisterinumero) ob;
        
        return (this.maa.equals(ver.maa) && (this.rekNro.equals(ver.rekNro)));
    }
    
    @Override
    public int hashCode(){
        int result = 17;
        result *= 31 * this.maa.hashCode();
        result *= 31 * this.rekNro.hashCode();
        return result;
    }
}
