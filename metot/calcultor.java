package Patika.metot;

import java.util.Scanner;

public class calcultor {
    //hesap makinesi
    static void plus(int s1,int s2){
        System.out.println("sonuç:"+s1+s2);
    }
    static void negative(int s1,int s2){
        System.out.println("sonuç"+(s1-s2));
    }
    static void multiplication(int s1,int s2){
        System.out.println("sonuc:"+s1*s2);
    }
    static void division(int s1,int s2){
        System.out.println("sonuc:"+(double) s1/s2);
    }
    static void power (int s1,int s2){
        int result=1;
        for (int i = 1; i <=s2 ; i++) {
            result=result*s1;
        }
        System.out.println("sonuc:"+result);
    }
    static void mod(int s1,int s2){
        System.out.println("sonuc:"+s1%s2);
    }
    static int factorial(int s1){
        if (s1 >1) {
         return s1*factorial(--s1);
        } else return 1;
    }
    static void dikdortgen(int s1,int s2){
        System.out.println("çevre:"+((s1+s2)*2)+"\nalan:"+s1*s2);}


    public static void main(String[] args) {
        int select;
        Scanner inp = new Scanner(System.in);
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap\n";
        while(true){
            System.out.print(menu + "Bir işlem seçiniz:");
            select = inp.nextInt();
            if (select == 0) break;
            System.out.print("sayı 1:");
            int  s1= inp.nextInt();
            System.out.print("sayı 2:");
            int s2= inp.nextInt();
            switch (select) {
                case 1:
                    plus(s1, s2);
                    break;
                case 2:
                    negative(s1,s2);
                    break;
                case 3:
                    multiplication(s1,s2);
                    break;
                case 4:
                    division(s1,s2);
                    break;
                case 5:
                    power(s1,s2);
                    break;
                case 6:
                    factorial(s1);
                    break;
                case 7:
                    mod(s1,s2);
                    break;
                case 8:dikdortgen(s1,s2);
                    break;
            }
        }


    }
}
