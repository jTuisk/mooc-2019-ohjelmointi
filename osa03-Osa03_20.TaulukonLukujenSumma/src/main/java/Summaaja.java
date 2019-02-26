
public class Summaaja {

    public static void main(String[] args) {
        // Tässä voit testata metodia
        int[] taulukko = {5, 1, 3, 4, 2};
        System.out.println(laskeTaulukonLukujenSumma(taulukko));
    }

    public static int laskeTaulukonLukujenSumma(int[] t) {
        // Kirjoita koodia tänne
        int sum = 0;
        for(int i : t){
            sum += i;
        }
        return sum;
    }
}
