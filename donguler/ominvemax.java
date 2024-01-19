package Patika.donguler;

import java.util.Scanner;

public class ominvemax {
    public static void main(String[] args) {
        //Java ile klavyeden girilen N tane sayma sayısından en büyük ve en küçük sayıları bulan ve bu sayıları ekrana yazan programı yazın.
        //Kaç tane sayı gireceksiniz: 4
        //1. Sayıyı giriniz: 16
        //2. Sayıyı giriniz: -22
        //3. Sayıyı giriniz: -15
        //4. Sayıyı giriniz: 100
        //En büyük sayı: 100
        //En küçük sayı: -22
        Scanner inp = new Scanner(System.in);
        System.out.print("Kaç sayı giriceksiniz?");
        int nnumber = inp.nextInt();
        if (nnumber>=1) {
            int number, max, min;
            System.out.print("lütfen 1. sayıyı giriniz:");
            number = inp.nextInt();
            max = number;
            min = number;

            for (int i = 2; i <= nnumber; i++) {
                System.out.print("lütfen " + i + ". sayıyı giriniz:");
                number = inp.nextInt();
                if (number < min) {
                    min = number;
                } else if (number > max) {
                    max = number;
                }
            }
            System.out.println("max değer:" + max);
            System.out.println("min değer:" + min);
        }
        else System.out.println("1den fazla sayı girmelisiniz!!");

    }
}
