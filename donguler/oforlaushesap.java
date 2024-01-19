package Patika.donguler;
import java.util.Scanner;
public class oforlaushesap {
    public static void main(String[] args) {
        //forla üs alan program
        Scanner inp= new Scanner(System.in);
        int num1,num2,total=1;
        System.out.print("Lütfen taban giriniz:");
        num1= inp.nextInt();
        System.out.print("Lütfen üs giriniz:");
        num2= inp.nextInt();
        for (int i = 0; i <num2 ; i++) {
            total=num1*total;
        }
        System.out.println("sonuç:"+total);
    }
}
