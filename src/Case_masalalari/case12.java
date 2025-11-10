package Case_masalalari;

import java.util.Scanner;

public class case12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qaysi element (1-radius, 2-diametr, 3-uzunlik, 4-doira yuzi)");
        int e = sc.nextInt();

        double D, L, S, r;

        switch (e) {
            case 1:
                System.out.println("Radius =");
                r = sc.nextDouble();

                D = 2 * r;
                L = 2 * Math.PI * r;
                S = Math.PI * (r * r);

                System.out.println("Diametr > " + D);
                System.out.println("Uzunlik > " + L);
                System.out.println("Doira yuzi > " + S);
                break;

            case 2:
                System.out.println("Diametr =");
                D = sc.nextDouble();

                r = D / 2;
                L = 2 * Math.PI * r;
                S = Math.PI * (r * r);

                System.out.println("Radius > " + r);
                System.out.println("Uzunlik > " + L);
                System.out.println("Doira yuzi > " + S);
                break;

            case 3:
                System.out.println("Uzunlik =");
                L = sc.nextDouble();

                r = L / (2 * Math.PI);
                D = r * 2;
                S = Math.PI * (r * r);

                System.out.println("Radius > " + r);
                System.out.println("Diametr > " + D);
                System.out.println("Doira yuzi > " + S);
                break;

            case 4:
                System.out.println("Doira yuzi =");
                S = sc.nextDouble();

                r = Math.sqrt(S / Math.PI);
                D = r * 2;
                L = 2 * Math.PI * r;

                System.out.println("Radius > " + r);
                System.out.println("Diametr > " + D);
                System.out.println("Uzunlik > " + L);
                break;

            default:
                System.out.println("Noto‘g‘ri tanlov!");
                break;
        }
    }
}
