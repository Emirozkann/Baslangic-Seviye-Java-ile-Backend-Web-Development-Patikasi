package Patika.donguler;
import java.util.Scanner;
public class ofaktoriyelkombinasyon {
    public static void main(String[] args) {
        // Java ile kombinasyon hesaplayan program yazınız.
        //C(n,r) = n! / (r! * (n-r)!)

        Scanner inp=new Scanner(System.in);
        long num1,num2,n=1,r=1,b,total;
        System.out.print("kaçın kaçlı kombinasyonunu istiyorsunuz sıra sıra giriniz:");
        num1= inp.nextInt();
        System.out.print("sayı 2:");
        num2=inp.nextInt();
        b=num1-num2;
        for (int i = 1; i <=num1 ; i++) { n*=i;;
        }
        for (int a = 1; a <=num2 ; a++) { r*=a;
        }

        for (int c = 1; c <=b ; c++) { b*=c;
        }
        total=n/(r * b);
        System.out.println(n+" "+r+" "+" "+b);
        System.out.println("cevap:"+total);


    }
}
