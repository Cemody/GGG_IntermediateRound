package progcompe;

import java.util.ArrayList;
import java.util.Scanner;

public class Inter3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String num = in.next();
        storeArray(num);
    }

    public static void storeArray(String num) {
        ArrayList<Integer> sta = new ArrayList<>();
        int q;
        for (int i = 0; i < num.length(); i++) {
            q = Integer.parseInt(num.substring(i, i+1));
            sta.add(q);
        }
        System.out.println(sta);
    }
}
