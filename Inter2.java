/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progcomp;

import java.util.Scanner;

/**
 *
 * @author Dexter Dela Rosa
 */
public class Number2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        System.out.println(n);

        int x = 0;
        int y = 0;

        for (int i = 0; i < n; i++) {
            x = Integer.parseInt(sc.next());
            y = Integer.parseInt(sc.next());
            System.out.println(x + " " + y);
            for (int j = 0; j < x; j++) {
                for (int k = 0; k < y; k++) {
                    if (j % 2 == 0) {
                        if (k % 2 == 0) {
                            System.out.print("*");
                        } else {
                            System.out.print(".");
                        }
                    }else{
                        if (k % 2 == 0) {
                            System.out.print(".");
                        } else {
                            System.out.print("*");
                        }
                    }

                }
                System.out.println("");
            }
            System.out.println("");
        }
    }
}
