package Patika.Kosul;

import java.util.Scanner;

public class Ölogin {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        //Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun
        //eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği ve unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip
        //şifreler aynı ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz." sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.
        String password, username, onay, evet, hayır, newpassword;
        System.out.print("Username:");
        username = inp.nextLine();
        System.out.print("Password:");
        password = inp.nextLine();
        if (password.equals("java123") && username.equals("emirsw")) {
            System.out.println("Giriş başarılı.");
        } else {
            System.out.print("Şifreniz hatalı,şifrenizi değiştirmek ister misiniz:");
            onay = inp.nextLine();
            if (onay.equals("evet")) {
                System.out.print("Yeni şifreniz eski şifrenizden ve yanlış girdiğiniz şifreden farklı olmalıdır\nYeni şifre:");
                newpassword = inp.nextLine();
                if (newpassword.equals(password) || newpassword.equals("java123")) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                } else System.out.println("Şifre oluşturuldu.");


            } else System.out.println("işlem bitmiştir.\n Giriş başarısız.");


        }


    }
}
