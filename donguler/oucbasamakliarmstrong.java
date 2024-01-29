package Patika.donguler;
public class oucbasamakliarmstrong {
    public static void main(String[] args) {
        for (int number = 100; number <= 999; number++) {
            int sonbas, tempnumber = number, basus = 1, endnumber = 0;

            while (tempnumber != 0) {
                sonbas = tempnumber % 10;
                for (int i = 1; i <= 3; i++) {
                    basus *= sonbas;}
                endnumber += basus;
                basus = 1;
                tempnumber /= 10;
            }
            if (endnumber == number) {
                System.out.println(number + "armstrong");
            }
        }
    }
}
