package Patika.degiskenTemelk.Pratik;
import java.util.Scanner;
public class taksimetre {
    public static void main(String[] args) {
        /*Taksimetre Programı
        Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.

        Taksimetre KM başına 2.20 TL tutmaktadır.
        Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
        Taksimetre açılış ücreti 10 TL'dir.*/
        Scanner input=new Scanner(System.in);
        double aç=10,kmtl=2.20,km,tutar;
        System.out.print("km giriniz:");

        km= input.nextDouble();
        System.out.println("kilometreniz:"+km+"km");
        tutar=aç+kmtl*km;

        tutar=(tutar<20) ? 20: tutar;
        System.out.println("Ödemeniz gereken ücret" + tutar+ "tl");

    }
}
