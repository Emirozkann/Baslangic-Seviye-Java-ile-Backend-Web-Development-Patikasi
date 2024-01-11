package Patika.Degisken;
import java.util.Scanner;
public class Kdvtutari {
    public static void main(String[] args) {

        //KDV Tutarı Hesaplayan Program
        //Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.
        //
        //(Not : KDV tutarını 18% olarak alın)
        //
        //KDV'siz Fiyat = 10;
        //
        //KDV'li Fiyat = 11.8;
        //
        //KDV tutarı = 1.8;
        //
        //Ödev
        //Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.

        Scanner input=new Scanner(System.in);

        double kdvsiztutar,kdvOran,kdvlifiyat,kdvtutari;

        System.out.print("Ödenen para:");
        kdvsiztutar= input.nextDouble();
        boolean dusukkoran= kdvsiztutar<1000;
        kdvOran= dusukkoran? 0.18:0.08;


        kdvtutari=kdvsiztutar*kdvOran;
        kdvlifiyat=kdvtutari+kdvsiztutar;

        System.out.println("kdv'siz fiyat"+kdvsiztutar);
        System.out.println("kdv oranı"+kdvOran);
        System.out.println("kdv tutarı:"+kdvtutari);
        System.out.println("kdvli fiyat"+kdvlifiyat);

    }
}
