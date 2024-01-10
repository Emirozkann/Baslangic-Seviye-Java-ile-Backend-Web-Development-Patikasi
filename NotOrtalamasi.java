package Patika.degiskenTemelk.Pratik;
import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {
        //Not Ortalaması Hesaplayan Program
        //Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan alan ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.
        //
        //Ödev
        //Aynı program içerisinde koşullu ifadeler kullanılarak, eğer kullanıcının ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.
        int matematik, fizik, kimya, türkçe, tarih, müzik;
        Scanner input=new Scanner(System.in);
        System.out.print("lütfen matematik notunuzu giriniz:");
        matematik=input.nextInt();
        System.out.println(matematik);

        System.out.print("lütfen fizik notunuzu giriniz:");
        fizik=input.nextInt();
        System.out.println(fizik);

        System.out.print("lütfen kimya notunuzu giriniz:");
        kimya=input.nextInt();
        System.out.println(kimya);

        System.out.print("lütfen türkçe notunuzu giriniz:");
        türkçe=input.nextInt();
        System.out.println(türkçe);

        System.out.print("lütfen tarih notunuzu giriniz:");
        tarih=input.nextInt();
        System.out.println(tarih);

        System.out.print("lütfen müzik notunuzu giriniz:");
        müzik=input.nextInt();
        System.out.println(müzik);

        System.out.print("ortalamanız:");
        double ortalama= (matematik+fizik+kimya+tarih+müzik+türkçe)/6;
        System.out.println(ortalama);

        boolean sonuç=ortalama>60;
        String doğruluk= sonuç? "Sınıfı geçti:)": "Sınıfta kaldı:(";
        System.out.println(doğruluk);



    }
}
