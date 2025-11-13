package For_masalalari;

import java.util.Scanner;

public class for4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("1 kg konfet narxi = ");
        double narx = sc.nextDouble();

        for (int i = 1; i <= 10; i++){
            double jami = narx * i;
            System.out.println(i + " kg konfetning narxi: " + jami);
        }
    }
}
