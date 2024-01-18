package Patika.donguler;
import java.util.Scanner;
public class ofibonacci {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        /*Java döngüler ile fibonacci serisi bulan program yazıyoruz. Fibonacci serisinin eleman sayısını kullanıcıdan alın.
         Fibonacci serisi, her sayının kendinden önceki ile toplanması sonucu oluşan bir sayı dizisidir.
         Bu şekilde devam eden bu dizide sayılar birbirleriyle oranlandığında
         altın oran ortaya çıkar, yani bir sayı kendisinden önceki sayıya bölündüğünde altın orana gittikçe yaklaşan bir dizi elde edilir.
         */
        int k,n1=0,n2=1,n3;
        System.out.print("Eleman sayısını giriniz: ");
        k = inp.nextInt();


        for (int i = 2  ;i<=k;i++){
            n3=n1+n2;
            System.out.print(n1 + " + " +n2 + " = "+n3);
            n1=n2;
            n2=n3;
            System.out.println();
        }




    }
}
