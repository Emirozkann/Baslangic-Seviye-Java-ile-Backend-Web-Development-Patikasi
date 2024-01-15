package Patika.Kosul;

import java.util.Scanner;

public class Ösinifgecme {
    public static void main(String[] args) {
        int mat, fiz, kimya, turkce, muzik, n = 5;
        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen matematik notunuzu giriniz:");
        mat = inp.nextInt();
        if (mat < 0) {
            mat = 0;
            n = n - 1;
        } else if (mat > 100) {
            mat = 0;
            n = n - 1;
        }

        System.out.print("Lütfen fizik notunuzu giriniz:");
        fiz = inp.nextInt();
        if (fiz < 0) {
            fiz = 0;
            n = n - 1;
        } else if (fiz > 100) {
            fiz = 0;
            n = n - 1;
        }
        System.out.print("Lütfen kimya notunuzu giriniz:");
        kimya = inp.nextInt();
        if (kimya < 0) {
            kimya = 0;
            n = n - 1;
        } else if (kimya > 100) {
            kimya = 0;
            n = n - 1;
        }
        System.out.print("Lütfen türkçe notunuzu giriniz:");
        turkce = inp.nextInt();
        if (turkce < 0) {
            turkce = 0;
            n = n - 1;
        } else if (turkce > 100) {
            turkce = 0;
            n = n - 1;
        }
        System.out.print("Lütfen müzik notunuzu giriniz:");
        muzik = inp.nextInt();
        if (muzik < 0) {
            muzik = 0;
            n = n - 1;
        } else if (muzik > 100) {
            muzik = 0;
            n = n - 1;
        }

        double avarage = (mat + fiz + kimya + turkce + muzik) / n;
        if (avarage < 55) {
            System.out.println("Sınıfta kaldınız...");
        } else System.out.println("Tebrikler sınıfı geçtiniz.");

        System.out.print("Ortalamanız:" + avarage);


    }
}
