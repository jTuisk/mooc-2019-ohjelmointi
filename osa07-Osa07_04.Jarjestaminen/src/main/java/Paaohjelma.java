
public class Paaohjelma {

    public static void main(String[] args) {
        // tee testikoodia tänne
        int[] taulukko = {3, 1, 5, 99, 3, 12};
    }

    public static int pienin(int[] taulukko){
        int result = taulukko[0];
        for(int n : taulukko){
            if(result > n)
                result = n;
        }
        return result;
    }
    
    public static int pienimmanIndeksi(int[] taulukko){
        int result = 0;
        for(int i = result; i < taulukko.length; i++){
            if(taulukko[result] > taulukko[i])
                result = i;
        }
        
        return result;
    }
    
    public static int pienimmanIndeksiAlkaen(int[] taulukko, int aloitusIndeksi){
        int result = aloitusIndeksi;
        for(int i = result; i < taulukko.length; i++){
            if(taulukko[result] > taulukko[i])
                result = i;
        }
        
        return result;
    }
    
    public static void vaihda(int[] taulukko, int i1, int i2){
        int m_i1 = taulukko[i1];
        taulukko[i1] = taulukko[i2];
        taulukko[i2] = m_i1;
    }
    
    public static void jarjesta(int[] taulukko){
        for(int i = 0; i < taulukko.length; i++){
            int m_pienin = taulukko[i];
            int pienin = pienimmanIndeksiAlkaen(taulukko, i);
            taulukko[i] = taulukko[pienin];
            taulukko[pienin] = m_pienin;
        }
    }
}
