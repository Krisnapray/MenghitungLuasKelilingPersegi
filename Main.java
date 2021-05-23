package objek;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int pilihan;
        Scanner input = new Scanner(System.in);

        System.out.println("Program menghitung Luas dan Keliling Persegi Panjang");
        System.out.println("1. menghitung keliling ");
        System.out.println("2. menghitung luas ");
        System.out.print("Masukkan pilihan : ");
        pilihan = input.nextInt();
        switch (pilihan) {
            case 1:
                Persegi kllp = new Persegi();
                System.out.println("Keliling Persegi : " + kllp.Luas() + " cm^2");
                break;
            case 2:
                LuasPersegi lp = new LuasPersegi();
                lp.luas();
                break;
        }
    }
}
