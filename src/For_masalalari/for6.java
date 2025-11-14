package For_masalalari;

import java.util.Scanner;

public class for6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("1 kg konfet narxi = ");
        double a = sc.nextDouble();

        for (int i = 2; i <= 10; i += 2) {
            double n = 1 + (i / 10.0);
            double narx = n * a;
            System.out.println(n + " kg konfetning narxi: " + narx);
        }
    }
}
