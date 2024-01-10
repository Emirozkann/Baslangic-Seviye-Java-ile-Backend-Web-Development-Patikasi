package Patika.degiskenTemelk.Pratik;
import java.util.Scanner;
public class manavkasa {
    public static void main(String[] args) {
        /*Manav Kasa Programı
        Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

        Meyveler ve KG Fiyatları

        Armut : 2,14 TL
        Elma : 3,67 TL
        Domates : 1,11 TL
        Muz: 0,95 TL
        Patlıcan : 5,00 TL
        Örnek Çıktı;

        Armut Kaç Kilo ? :0
        Elma Kaç Kilo ? :1
        Domates Kaç Kilo ? :1
        Muz Kaç Kilo ? :2
        Patlıcan Kaç Kilo ? :3
        Toplam Tutar : 21.68 TL*/
        Scanner input=new Scanner(System.in);
        double elmakg, elmatl=3.67, armuttl=2.14,armutkg,domatestl=1.11,domateskg,muztl=0.95,muzkg,patlıcantl=5.00,patlıcankg,t;
        System.out.print("Elma kaç kilo:");
        elmakg= input.nextDouble();

        System.out.print("Armut kaç kilo:");
        armutkg= input.nextDouble();

        System.out.print("Domates kaç kilo:");
        domateskg= input.nextDouble();

        System.out.print("Muz kaç kilo:");
        muzkg= input.nextDouble();

        System.out.print("Patlıcan kaç kilo:");
        patlıcankg= input.nextDouble();

        t=elmakg*elmatl+muzkg*muztl+patlıcantl*patlıcankg+domateskg*domatestl+armutkg*armuttl;
        System.out.println("Toplam tutar:"+t + "Türk Lirası");




    }
}
