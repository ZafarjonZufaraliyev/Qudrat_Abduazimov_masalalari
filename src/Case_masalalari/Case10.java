package Case_masalalari;

import java.util.Scanner;

public class Case10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Yo'nalish (j, s, g', q): ");
        String a = sc.nextLine();

        System.out.print("Komanda (0=to‘g‘ri, 1=chap, 2=o‘ng): ");
        int b = sc.nextInt();

        switch (a) {
            case "j":
                if (b == 0)
                    System.out.println("Janubga harakatlanmoqda");
                else if (b == 1)
                    System.out.println("Sharqqa burildi");
                else if (b == 2)
                    System.out.println("G‘arbga burildi");
                break;

            case "s":
                if (b == 0)
                    System.out.println("Shimolga harakatlanmoqda");
                else if (b == 1)
                    System.out.println("G‘arbga burildi");
                else if (b == 2)
                    System.out.println("Sharqqa burildi");
                break;

            case "g'":
                if (b == 0)
                    System.out.println("G‘arbga harakatlanmoqda");
                else if (b == 1)
                    System.out.println("Janubga burildi");
                else if (b == 2)
                    System.out.println("Shimolga burildi");
                break;

            case "q":
                if (b == 0)
                    System.out.println("Sharqqa harakatlanmoqda");
                else if (b == 1)
                    System.out.println("Shimolga burildi");
                else if (b == 2)
                    System.out.println("Janubga burildi");
                break;

            default:
                System.out.println("Xato yo‘nalish kiritildi!");
        }
    }
}
