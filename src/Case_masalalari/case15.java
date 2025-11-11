package Case_masalalari;

import java.util.Scanner;

public class case15 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("1 - G‘ish");
        System.out.println("2 - Olma");
        System.out.println("3 - Chillik");
        System.out.println("4 - Qarg‘a");
        System.out.print("Karta turi (1–4) >>> ");
        int n = sc.nextInt();

        System.out.print("Karta qiymati (6–14) >>> ");
        int m = sc.nextInt();

        String tur = switch (n) {
            case 1 -> "g‘ish";
            case 2 -> "olma";
            case 3 -> "chillik";
            case 4 -> "qarg‘a";
            default -> "noma’lum";
        };

        String qiymat = switch (m) {
            case 6 -> "olti";
            case 7 -> "yetti";
            case 8 -> "sakkiz";
            case 9 -> "to‘qqiz";
            case 10 -> "o‘n";
            case 11 -> "valet";
            case 12 -> "dama";
            case 13 -> "qirol";
            case 14 -> "tuz";
            default -> "noma’lum";
        };

        System.out.println(qiymat + " " + tur);
    }
}
