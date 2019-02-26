
import java.util.ArrayList;

public class MaPu {

    public static double keskiarvo(ArrayList<Integer> luvut){
        int sum = 0;
        for(int n : luvut)
            sum += n;
        
        return ((double)sum/luvut.size());
    }
    // toteuta apumetodit tänne
}
