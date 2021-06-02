/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progcomp;

import java.util.Arrays;

/**
 *
 * @author
 */
public class Inter1 {
    public static void main(String[] args) {
        String[] ar1 = {"a", "b", "c"};
        String[] ar2 = {"1", "2", "3"};
        System.out.println(Arrays.toString(ar1));
        System.out.println(Arrays.toString(ar2));
        int n = ar1.length+ar2.length;
        int x = 0;
        int y = 0;
        String[] ar3 = new String[n];
        for (int i = 0; i < n; i++) {
            if (i%2==0) {
                ar3[i] = ar1[x];
                x++;
            }else{
                ar3[i] = ar2[y];
                y++;
            }
            
        }
        System.out.println(Arrays.toString(ar3));
    }
}
