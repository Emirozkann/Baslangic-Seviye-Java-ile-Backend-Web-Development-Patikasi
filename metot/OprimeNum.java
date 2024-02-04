package Patika.metot;

import java.util.Scanner;

public class OprimeNum {
    //Java dilinde "Recursive" metot kullanarak, kullanıcıdan alınan sayının "Asal" sayı olup olmadığını bulan programı yazın.
    static void prime(int x,int r) {
        int z=1;
        z=x%r;
        if (x == 2) {
            System.out.println("2 sayısı asaldır");

        }
        else if (z == 0||x==1) {
            System.out.println(x+" sayısı asalDizi değildir.");
        }
        else if (r<x/2) {
            prime(x,++r);
        }
        else System.out.println(x+" sayısı asaldır");
    }


    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a = 0;
        while (a != 1) {
            System.out.print("please input number:");
            int num = inp.nextInt();
            int result=2;
            prime(num,result);
            System.out.println("exit program? 1-Yes 2-No");
            a = inp.nextInt();

        }


    }
}
