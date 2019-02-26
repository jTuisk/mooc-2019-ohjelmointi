
public class Kappale {

    private String esittaja;
    private String nimi;
    private int pituusSekunteina;

    public Kappale(String esittaja, String nimi, int pituusSekunteina) {
        this.esittaja = esittaja;
        this.nimi = nimi;
        this.pituusSekunteina = pituusSekunteina;
    }

    @Override
    public String toString() {
        return this.esittaja + ": " + this.nimi + " (" + this.pituusSekunteina + " s)";
    }

    @Override
    public boolean equals(Object ver){
        if(this == ver)
            return true;
        
        if(!(ver instanceof Kappale))
            return false;
        
        Kappale v = (Kappale) ver;
        
        if(this.esittaja == v.esittaja &&
           this.nimi == v.nimi &&
           this.pituusSekunteina == v.pituusSekunteina)
            return true;
        
        return false;
    }
}
