package For_masalalari;

import java.util.Scanner;

public class for12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n= ");
        int n = sc.nextInt();

        double S = 1;
        for (int i = 1; i <= n; i++) {
            double a = (i/10.0) + 1;
            S = S*a;
        }
        System.out.println(S);
    }
}
