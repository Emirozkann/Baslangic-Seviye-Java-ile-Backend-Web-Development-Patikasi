package Patika.degiskenTemelk.Pratik;
import java.util.Scanner;
public class Kdvtutarı {
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

        double kdvsiztutar,kdvOran,kdvlifiyat,kdvtutarı;

        System.out.print("Ödenen para:");
        kdvsiztutar= input.nextDouble();
        boolean düşükkoran= kdvsiztutar<1000;
        kdvOran= düşükkoran? 0.18:0.08;


        kdvtutarı=kdvsiztutar*kdvOran;
        kdvlifiyat=kdvtutarı+kdvsiztutar;

        System.out.println("kdv'siz fiyat"+kdvsiztutar);
        System.out.println("kdv oranı"+kdvOran);
        System.out.println("kdv tutarı:"+kdvtutarı);
        System.out.println("kdvli fiyat"+kdvlifiyat);







    }
}
