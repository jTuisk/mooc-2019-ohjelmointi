
import java.util.ArrayList;

public class Tehtavienhallinta {
           ArrayList<Tehtava> tehtavat;
           
    public Tehtavienhallinta(){
        this.tehtavat = new ArrayList<>();
    }
    
    public ArrayList<String> tehtavalista(){
        ArrayList<String> tehtavalista = new ArrayList<>();
        for(Tehtava t : tehtavat)
            tehtavalista.add(t.getNimi());
        
        return tehtavalista;
    }
    
    public void lisaa(String tehtava){
        this.tehtavat.add(new Tehtava(tehtava));
    }
    
    public void poista(String tehtava){
        int i = -1;
        for(Tehtava t : this.tehtavat){
            if(t.getNimi().equals(tehtava)){
                this.tehtavat.remove(this.tehtavat.indexOf(t));
                break;
            }
        }
    }

    public void merkkaaTehdyksi(String tehtava){
        for(Tehtava t : this.tehtavat){
            if(t.getNimi().equals(tehtava))
                t.setTehty(true);
        }
    }
    
    public boolean onTehty(String tehtava){
        for(Tehtava t : this.tehtavat){
            if(t.getNimi().equals(tehtava))
                return t.onTehty();
        }
        return false;
    }
}
