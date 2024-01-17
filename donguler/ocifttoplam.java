package Patika.donguler;

import java.util.Scanner;

public class ocifttoplam {
    public static void main(String[] args) {
        //Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.
        Scanner input = new Scanner(System.in);
        double sayi, toplam = 0, sayac = 0;
        double ort;
        sayi = input.nextInt();
        for (int i = 1; i < sayi; i++) {
            if (i % 3 == 0 && sayi % 4 == 0) {
                toplam = toplam + i;
                sayac = sayac + 1;
            } else if (i % 3 == 0) {
                toplam = toplam + i;
                sayac = sayac + 1;

            } else if (i % 4 == 0) {
                toplam = toplam + i;
                sayac = sayac + 1;
            }
        }
        ort = toplam / sayac;
        System.out.println(ort);




    }
}
