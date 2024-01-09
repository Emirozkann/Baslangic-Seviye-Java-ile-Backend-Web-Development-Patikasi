package Patika.degiskenTemelk.Pratik;
import java.util.Scanner;
public class dikhipotenüs {
    public static void main(String[] args) {
        /*Dik Üçgende Hipotenüs Bulan Program
        Java ile kullanıcıdan dik kenarlarının uzunluğunu alan ve hipotenüsü hesaplayan programı yazın.
        Ödev
        Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.
        Formül
        Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢
        𝑢 = (a+b+c) / 2
        Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)*/
        Scanner input= new Scanner(System.in);
        double a,b,c,u,alankare,alan;
        System.out.print("lütfen a kenarının uzunluğunu giriniz:");
        a= input.nextDouble();
        System.out.print("lütfen b kenarının uzunluğunu giriniz:");
        b=input.nextDouble();
        c=Math.sqrt(a*a+b*b);
        System.out.println("c kenarının uzunluğu"+ c);

        u=(a+b+c)/2;
        alankare=u*(u-a)*(u-b)*(u-c);
        alan=Math.sqrt(alankare);
        System.out.println("Üçgeninizin alanı"+ alan);



    }
}
