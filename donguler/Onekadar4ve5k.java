package Patika.donguler;

import java.util.Scanner;

public class Onekadar4ve5k {
    public static void main(String[] args) {
        //Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.
        Scanner input = new Scanner(System.in);
        int sayi, kat4 = 1, kat5 = 1;
        sayi = input.nextInt();
        while (kat4 <= sayi || kat5 <= sayi) {
            System.out.println(kat4);
            kat4*=4;
            if ((kat5*=5)<=sayi){
                System.out.println(kat5);
            }


        }
    }
}
