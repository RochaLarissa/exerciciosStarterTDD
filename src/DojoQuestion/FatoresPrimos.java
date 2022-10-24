package DojoQuestion;

import java.util.ArrayList;
import java.util.List;

public class FatoresPrimos {
	
	public static List<Integer> FatoresPrimos(int numero) {
        int n = numero;
        List<Integer> fatores = new ArrayList();
        
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                fatores.add(i);
                n = n / i;
            }
        }
        
        return fatores;
    }

}
