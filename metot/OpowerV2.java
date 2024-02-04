package Patika.metot;

import java.util.Scanner;

public class OpowerV2 {
    static double power(double t, int p) {
        if (p < 0) {
            return 1 / t * power(t, p+1);
        } else if (p > 0) {
            return t * power(t, p-1);
        } else return 1;

    }

    public static void main(String[] args) {
        //Java dilinde, taban ve üs değerleri kullanıcıdan alınan üs alma işlemini "Recursive" metot kullanarak yapan programı yazınız.
        Scanner inp = new Scanner(System.in);
        int num = 0;

        while (num != 1) {
            System.out.print("input temp:");
            double temp = inp.nextInt();
            System.out.print("input power:");
            int power = inp.nextInt();
            System.out.println(power(temp, power));
            System.out.println("exit program? 1-Yes 2-No");
            num = inp.nextInt();
        }


    }
}
