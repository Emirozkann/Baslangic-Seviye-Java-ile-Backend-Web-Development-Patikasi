package Patika.degiskenTemelk.Pratik;
import java.util.Scanner;
public class dairealançevre {
    public static void main(String[] args) {
        /*Dairenin Alanını ve Çevresini Hesaplayan Program
        Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.

        Alan Formülü : π * r * r;
        Çevre Formülü : 2 * π * r;
        Ödev Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
        𝜋 sayısını = 3.14 alınız.
                Formül : (𝜋 * (r*r) * 𝛼) / 360 */
        Scanner input= new Scanner(System.in);
        double r, alan, çevre, pi=3.14,dilim,açı,dçevre;
        System.out.print("Lütfen yarıçapı giriniz:");
        r= input.nextDouble();
        çevre= 2*pi*r;
        alan=pi*r*r;
        System.out.println("Dairenin alanı:"+alan);
        System.out.println("Dairenin çevresi:"+çevre);

        System.out.print("Lütfen açı giriniz:");
        açı= input.nextDouble();
        dilim=(pi*(r*r)*açı)/360;
        System.out.println("Daire diliminizin alanı"+dilim);

        dçevre=2*r+çevre*(açı/360);
        System.out.println("Daire diliminizin çevresi:"+dçevre);











    }
}
