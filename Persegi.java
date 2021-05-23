package objek;

import java.util.Scanner;

public class Persegi extends BangunDatar {
    private double s,kll;

    Scanner input = new Scanner(System.in);

    @Override
    public double Luas() {
        System.out.print("Panjang : ");
        s = input.nextInt();
        return s+s;
    }
}
