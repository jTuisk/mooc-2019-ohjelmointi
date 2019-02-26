
public class Lukutilasto {
      private int lukujenMaara = 0, summa = 0;

    public Lukutilasto() {
        // alusta tässä muuttuja lukujenMaara
    }

    public void lisaaLuku(int luku) {
        // kirjoita koodia tähän
        summa += luku;
        lukujenMaara++;
    }

    public int haeLukujenMaara() {
        // kirjoita koodia tähän
        return lukujenMaara;
    }
    
    public int summa(){
        return summa;
    }
    
    public double keskiarvo(){
        if(summa == 0 || lukujenMaara == 0)
            return 0;
        return ((double)summa/lukujenMaara);
    }
}
