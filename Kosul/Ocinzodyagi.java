package Patika.Kosul;

import java.util.Scanner;

public class Ocinzodyagi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int yil, kalan;
        System.out.print("Doğum Yılınızı Giriniz :");
        yil = input.nextInt();
        kalan = yil % 12;
        switch (kalan) {
            case 0:
                System.out.println("Çin Zodyağı Burcunuz : maymun");
                break;
            case 1:
                System.out.println("Çin Zodyağı Burcunuz : Horoz");
                break;
            case 2:
                System.out.println("Çin Zodyağı Burcunuz : köpek");
                break;
            case 3:
                System.out.println("Çin Zodyağı Burcunuz : domuz");
                break;
            case 4:
                System.out.println("Çin Zodyağı Burcunuz : fare");
                break;
            case 5:
                System.out.println("Çin Zodyağı Burcunuz : öküz");
                break;
            case 6:
                System.out.println("Çin Zodyağı Burcunuz : kaplan");
                break;
            case 7:
                System.out.println("Çin Zodyağı Burcunuz : tavşan");
                break;
            case 8:
                System.out.println("Çin Zodyağı Burcunuz : ejderha");
                break;
            case 9:
                System.out.println("Çin Zodyağı Burcunuz : yılan");
                break;
            case 10:
                System.out.println("Çin Zodyağı Burcunuz : at");
                break;
            case 11:
                System.out.println("Çin Zodyağı Burcunuz : koyun");
                break;
            default:
        }

    }
}
