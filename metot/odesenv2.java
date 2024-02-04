package Patika.metot;

import java.util.Scanner;

public class odesenv2 {
    static int v1(int x,int y){
        System.out.println(x);
        if (x > 0) {return v1(x-5,y);
        }
        else return v2(x+5,y);
    }
    static int v2(int x,int y){
        System.out.println(x);
        if (x<y-5) {
            return v2(x+5,y);
        }
        return x+5;
    }
    public static void main(String[] args) {
        // sayıyı 5 eksilterek 0 veya eksi olana kadar sonrada sayıya kadar yazdıran recursive fonksiyon
        // 23 18 13 8 3 -2 3 8 13 18 23
        System.out.print("sayı giriniz:");
        Scanner inp=new Scanner(System.in);
        int x=inp.nextInt();
        int y=x;
        System.out.println(v1(x,y));
    }
}
