package Patika.Kosul;

import java.util.Scanner;

public class Ösiralama {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a, b, c;
        System.out.println("--Girilen 3 sayıyı küçükten büyüğe sıralayan program--");
        System.out.print("Sayı 1:");
        a = inp.nextInt();
        System.out.print("Sayı 2:");
        b = inp.nextInt();
        System.out.print("Sayı 3:");
        c = inp.nextInt();
        if (a < b) {
            if (b < c) {
                System.out.println(a + " < " + b + " < " + c);
            } else if (a < c) {
                System.out.println(a + " < " + c + " < " + b);

            } else System.out.println(c + " < " + a + " < " + b);
        }
        else {  //b<a
            if (a < c) {
                System.out.println(b + " < " + a + " < " + c);
            } else if (c < b) {
                System.out.println(c + " < " + b + " < " + a);

            } else System.out.println(b + " < " + c + " < " + a);
        }

    }
}
