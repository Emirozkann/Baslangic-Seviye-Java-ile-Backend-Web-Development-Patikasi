package Patika.donguler;
public class oasal {
    public static void main(String[] args)  {
        //belirlenen sayıya kadar olan asalları ekrana yazdıran program
        System.out.println("Asal sayılar:"+"2");
        int  a,kontrol=1;
        for (int i = 3; i <50000; i++) {
            for (int j = 2; j <i ; j++) {
                a=i%j;
                kontrol*=a;
                if (kontrol != 0) {kontrol=1;
                }
            }
            if (kontrol != 0) {
                System.out.println(i);
            }
            kontrol=1;
        }

    }
}
