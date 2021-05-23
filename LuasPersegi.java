package objek;

import java.util.Scanner;

public class LuasPersegi implements Luas{
    private double s, l;

    Scanner input = new Scanner(System.in);

    @Override
    public void luas() {
        System.out.print("Sisi : ");
        s = input.nextInt();
        l = s*s;
        System.out.println("kll Persegi Panjang : "+ l + " cm^2");
    }
}
