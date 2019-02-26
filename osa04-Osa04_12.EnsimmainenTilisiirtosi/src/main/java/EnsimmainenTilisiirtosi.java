
public class EnsimmainenTilisiirtosi {

    public static void main(String[] args) {
        // Tili.Java:ssa olevaan koodiin ei tule koskea
        // tee ohjelmasi tänne
        Tili m_tili = new Tili("matin tili", 1000);
        Tili o_tili = new Tili("Oma tili", 0);
        
        m_tili.otto(100.00);
        o_tili.pano(100.00);
        System.out.println(m_tili.saldo());
        System.out.println(o_tili.saldo());
    }
}
