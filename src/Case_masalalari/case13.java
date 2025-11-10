package Case_masalalari;

import java.util.Scanner;

public class case13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qaysi element berilgan?");
        System.out.println("1 - Katet (a)");
        System.out.println("2 - Gipotenuza (c)");
        System.out.println("3 - Balandlik (h)");
        System.out.println("4 - Yuza (S)");
        int e = sc.nextInt();

        double a, c, h, S;

        switch (e) {
            case 1:
                System.out.print("Katet (a) = ");
                a = sc.nextDouble();

                c = a * Math.sqrt(2);
                h = c / 2;
                S = (c * h) / 2;

                System.out.println("Gipotenuza = " + c);
                System.out.println("Balandlik = " + h);
                System.out.println("Yuza = " + S);
                break;

            case 2:
                System.out.print("Gipotenuza (c) = ");
                c = sc.nextDouble();

                a = c / Math.sqrt(2);
                h = c / 2;
                S = (c * h) / 2;

                System.out.println("Katet = " + a);
                System.out.println("Balandlik = " + h);
                System.out.println("Yuza = " + S);
                break;

            case 3:
                System.out.print("Balandlik (h) = ");
                h = sc.nextDouble();

                c = 2 * h;
                a = h * Math.sqrt(2);
                S = h * h;

                System.out.println("Katet = " + a);
                System.out.println("Gipotenuza = " + c);
                System.out.println("Yuza = " + S);
                break;

            case 4:
                System.out.print("Yuza (S) = ");
                S = sc.nextDouble();

                c = 2 * Math.sqrt(S);
                h = Math.sqrt(S);
                a = Math.sqrt(2 * S);

                System.out.println("Katet = " + a);
                System.out.println("Gipotenuza = " + c);
                System.out.println("Balandlik = " + h);
                break;

            default:
                System.out.println("Xato tanlov!");
        }
    }
}
