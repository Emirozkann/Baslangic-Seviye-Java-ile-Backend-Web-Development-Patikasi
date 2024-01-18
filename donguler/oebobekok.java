package Patika.donguler;
import java.util.Scanner;
public class oebobekok {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int n1,n2,ebob=1,ekok,i=1;
        System.out.print("lütfen 1.sayıyı giriniz:");
        n1= inp.nextInt();
        System.out.print("lütfen 2.sayıyı giriniz:");
        n2= inp.nextInt();

        while (i<=n1){
            if (n1%i==0&&n2%i==0) {ebob=i;
            }i++;
        }
        System.out.println("ebob:"+ebob);
        ekok=(n1*n2)/ebob;
        System.out.println("ekok:"+ekok);
    }
}
