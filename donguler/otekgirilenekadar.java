package Patika.donguler;
import  java.util.Scanner;
public class otekgirilenekadar {
    public static void main(String[] args) {
        //Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve
        //girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
        int number,top=0,s=1;
        Scanner input=new Scanner(System.in);
        do {
            System.out.print("lütfen bir sayı giriniz:");
            number= input.nextInt();
            if (number%2==0){
                System.out.println("sayı"+s+":" +number);
                top=top+number;
                s++;
            }

        }
        while (number%2==0);
        System.out.println("toplam"+top);


    }
}
