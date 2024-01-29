package Patika.donguler;

import java.util.Scanner;

public class otersucgen {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("kaç satırlı üçgen istersiniz:");
        int line = inp.nextInt();
        int endline = line, a = 1;
        for (int i = 1; i <= line; i++) {
            for (int j = 1; j < a; j++) {
                System.out.print(" ");
            }
            a++;
            for (int j = 1; j <= ((endline * 2) - 1); j++) {
                System.out.print("*");
            }
            endline--;
            System.out.println();
        }


    }
}
