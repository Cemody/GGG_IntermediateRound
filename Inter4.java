package progcompe;

import java.util.ArrayList;
import java.util.Scanner;

public class Inter4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int loop = in.nextInt();
        if(loop > 100) System.exit(0);
        int m;
        double ans;
        ArrayList<Integer> store = new ArrayList<>();
        for (int i = 1; i <= loop; i++) {
            m = in.nextInt();
            if(m > 500000) System.exit(0);
            ans = (4*m)/9;
            ans = ((ans/(4/3*Math.PI)));
            ans = Math.cbrt(ans);
            ans = ((ans*4+(ans/4)*2));
            int a = (int) ans;
            store.add(a);
        }
        for (int i = 0; i < store.size(); i++) {
            System.out.println(store.get(i));
        }
    }
}
