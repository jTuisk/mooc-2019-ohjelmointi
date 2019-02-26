
public class EnsimmainenTilisi {

    public static void main(String[] args) {
        // Tili.Java:ssa olevaan koodiin ei tule koskea
        // tee ohjelmasi tänne
        Tili tili = new Tili("Janekin tili", 100.00);
        tili.pano(20.00);
        System.out.println(tili.saldo());
    }
}
