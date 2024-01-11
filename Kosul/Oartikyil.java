package Patika.Kosul;

import java.util.Scanner;

public class Oartikyil {
    public static void main(String[] args) {
        int yil;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen yıl giriniz:");
        yil = input.nextInt();
        if (yil % 100 != 0) {
            if (yil % 4 == 0) {
                System.out.println("Artık yıl");
            } else {
                System.out.println("Artık yıl değil");
            }
        } else if (yil % 400 == 0) {
            System.out.println("Artık yıl");
        } else {
            System.out.println("Artık yıl değil");
        }

    }
}
