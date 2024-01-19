package Patika.donguler;
import java.util.Scanner;
public class omukemmelsayi {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        int a,total=0;
        System.out.print("Lütfen bir sayı giriniz:");
        a= inp.nextInt();

        if (a>1) {
            for (int i = 1; i <= a / 2; i++) {
                if (a % i == 0) {
                    total = total + i;
                }
            }
            if (total == a) {
                System.out.println(a + " mükemmel sayıdır");
            } else System.out.println(a + " mükemmel sayı değildir");
        } else if (a==1) {
            System.out.println("1 mükemmel sayı değildir");
        }
        else System.out.println("lütfen pozitif bir sayı giriniz");


    }
}
