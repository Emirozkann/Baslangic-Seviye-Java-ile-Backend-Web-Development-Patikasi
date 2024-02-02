package Patika.metot;

import java.util.Scanner;

public class odesen {

    static int desen(int x, boolean y, int z) {
        System.out.print(x + " ");
        if (y && x < z - 5) {
            return desen(5 + x, y, z);
        } else if (y) {
            return x + 5;

        } else if (x > 0) {
            return desen(x - 5, y, z);
        } else {
            y = true;
            return desen(5 + x, y, z);
        }
    }

    public static void main(String[] args) {
        // sayıyı 5 eksilterek 0 veya eksi olana kadar sonrada sayıya kadar yazdıran recursive fonksiyon
        // 23 18 13 8 3 -2 3 8 13 18 23
        Scanner inp = new Scanner(System.in);
        int num = inp.nextInt();
        int z = num;
        boolean y = false;
        System.out.println(desen(num, y, z));
    }
}
