
public class Asunto {

    private int huoneita;
    private int nelioita;
    private int neliohinta;

    public Asunto(int huoneita, int nelioita, int neliohinta) {
        this.huoneita = huoneita;
        this.nelioita = nelioita;
        this.neliohinta = neliohinta;
    }

    public boolean suurempi(Asunto ver){
        if(this.nelioita > ver.nelioita)
            return true;
        return false;
    }
    
    public int hintaero(Asunto ver){
        int ero = ((this.neliohinta*this.nelioita) - (ver.neliohinta*ver.nelioita));
        ero = ero < 0 ? (ero* -1) : ero;
        return ero;
    }
    
    public boolean kalliimpi(Asunto ver){
        if((this.neliohinta*this.nelioita) > (ver.neliohinta*ver.nelioita))
            return true;
        return false;
    }
}
