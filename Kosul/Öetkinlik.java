package Patika.Kosul;
import java.util.Scanner;
public class Öetkinlik {
    public static void main(String[] args) {
        //Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
        //Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
        //Sıcaklık 10 ve 25 arasında ise "Piknik" etkinliğini öner.
        //Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
        Scanner inp= new Scanner(System.in);
        System.out.print("Lütfen sıcaklık giriniz:");
        int heat= inp.nextInt();
        if (heat<5){
            System.out.println("Kayak yapmaya gidebilirsiniz.");
        } else if (heat<10) {
            System.out.println("Sinemaya gidebilirsiniz.");
        } else if (heat<15) {
            System.out.println("Sinema veya yüzme yapabilirsiniz.");
        } else if (heat<25) {
            System.out.println("Pikniğe gidebilirsiniz.");
        }
        else System.out.println("Yüzmeye gidebilirsiniz.");
    }
}
