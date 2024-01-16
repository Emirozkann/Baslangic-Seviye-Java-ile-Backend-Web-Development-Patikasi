package Patika.Kosul;

import java.util.Scanner;

public class Öswitchhesap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int s1, s2, i;
        System.out.print("lütfen 1. sayıyı giriniz:");
        s1 = input.nextInt();
        System.out.print("lütfen 2. sayıyı giriniz:");
        s2 = input.nextInt();
        System.out.println("sayı 1:" + s1 + "\nsayı 2:" + s2);
        System.out.print("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme\nLütfen yapmak istediğiniz işlemin başındaki rakamı girin:");
        i = input.nextInt();
        double c;
        c = (double) s1 / s2;
        switch (i) {
            case 1:
                System.out.println("Toplama işleminizin sonucu:" + (s1 + s2));
                break;
            case 2:
                System.out.println("çıkarma işeminizin sonucu:" + (s1 - s2));
                break;
            case 3:
                System.out.println("Çarpma işlemi sonucunuz:" + (s1 * s2));
                break;
            case 4:
                switch (s2) {
                    case 0:
                        System.out.println("Bölme işleminde sayı 0 a bölünemez");
                        break;
                    default:
                        System.out.println("Bölme işlemi sonucunuz:" + c);

                }

        }


    }
}
