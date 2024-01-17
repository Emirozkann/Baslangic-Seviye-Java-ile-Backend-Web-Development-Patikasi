package Patika.donguler;
import java.util.Scanner;
public class oatm {
    public static void main(String[] args) {
        //Aynı projedeki ATM işlemlerini "Switch-Case" kullanarak yapınız.
        Scanner inp=new Scanner(System.in);
        String username, password;
        int sayac = 3, balance = 1500, secim, price;

        while (sayac > 0) {
            System.out.print("Kullanıcı adınızı giriniz:");
            username = inp.nextLine();
            System.out.print("Şifre giriniz:");
            password = inp.nextLine();
            if (username.equals("emirsw") && password.equals("sw1234")) {
                do {
                    System.out.println("Merhaba sw bankasına hoşgeldiniz!\nLütfen yapmak istediğiniz işlemi seçiniz\n1-Para çekme\n2-Para yatırma\n3-Bakiye sorgula\n4-Çıkış yap");
                    secim = inp.nextInt();
                    if (secim == 1) {
                        System.out.print("bakiyeniz:" + balance + "tl\n" + "lütfen çekmek istediğiniz para miktarını giriniz:");
                        price = inp.nextInt();
                        if (price < balance) {
                            balance -= price;
                            System.out.println("Çekilen para " + price + "tl" + "\nKalan bakiye:" + balance);
                        } else System.out.println("Bakiye yetersiz");

                    }
                    else if (secim == 2) {
                        System.out.print("lütfen yatırmak istediğiniz para miktarını giriniz:");
                        price=inp.nextInt();
                        if (price >0) {balance+=price;
                            System.out.println("yatırılan para " + price + "tl" + "\n bakiye:" + balance);

                        }else System.out.println("Yanlış bir değer girdiniz!");
                    } else if (secim==3) {
                        System.out.println("Bakiyeniz: "+balance+"tl");

                    }


                } while (secim != 4);System.out.println("çıkış yapıldı.");
                break;


            } else {
                System.out.println("Kullanıcı adınız veya şifrenizi yanlış girdiniz.");
                sayac--;
                if (sayac > 0) {
                    System.out.println(sayac + " deneme hakkınız kaldı");
                } else System.out.println("Hesabınız bloke olmuştur.");
            }
        }


    }
}
