package Patika.Kosul;

import java.util.Scanner;

public class Oucakbilet {
    public static void main(String[] args) {
       /* Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın.
       Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın.
       Mesafe başına ücret 0,10 TL / km olarak alın. İlk olarak uçuşun toplam fiyatını hesaplayın ve
       sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;
        Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı,
        yolculuk tipi ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
        Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
        Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
        Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
        Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.*/
        Scanner input = new Scanner(System.in);
        int yas, mesafe, tip;
        double fiyat;

        System.out.print("lütfen yaşınızı giriniz:");
        yas = input.nextInt();
        if (yas < 0) {
            System.out.println("Yaş değeri negatif olamaz");
        } else System.out.println("Yaş:" + yas);

        System.out.print("lütfen mesafe giriniz:");
        mesafe = input.nextInt();
        if (mesafe < 0) {
            System.out.println("Mesafe değeri negatif olamaz");
        } else System.out.println("Mesafe:" + mesafe);

        System.out.print("1-Tek yön\n2-Gidiş-Dönüş\n Lütfen gidiceğiniz yönün numarasını giriniz:");
        tip = input.nextInt();
        if (tip < 1 || tip > 2) System.out.println("Yanlış bir tip girdiniz");

        fiyat = mesafe * 0.1;


        if (yas < 12) {
            fiyat = fiyat * 0.5;
        } else if (yas < 24) {
            fiyat = fiyat * 0.9;
        } else if (yas > 65) {
            fiyat = fiyat * 0.7;
        }
        if (tip == 2) {
            fiyat = (fiyat * 2) * 0.8;
        }
        System.out.println("indirimli fiyat:" + fiyat);


    }
}
