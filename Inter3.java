package progcompe;

import java.util.Scanner;
import java.util.Stack;

public class Inter3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        storeArray(num);
        
    }
    public static void storeArray(int num){
            Stack<Integer> sta = new Stack<>();
            int q;
            while(num!=0){
                q=num%10;
                num=num/10;
                sta.push(q);
            }
            System.out.println(sta);
        }
}
