package Case_masalalari;

import java.util.Scanner;

public class case16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Yoshingiz (20–69): ");
        int y = sc.nextInt();


        String birlik = switch (y % 10) {
            case 1 -> "bir";
            case 2 -> "ikki";
            case 3 -> "uch";
            case 4 -> "to'rt";
            case 5 -> "besh";
            case 6 -> "olti";
            case 7 -> "yetti";
            case 8 -> "sakkiz";
            case 9 -> "to'qqiz";
            default -> "";
        };

        String onlik = switch (y / 10) {
            case 2 -> "yigirma";
            case 3 -> "o‘ttiz";
            case 4 -> "qirq";
            case 5 -> "ellik";
            case 6 -> "oltmish";
            default -> "";
        };

        System.out.println(onlik + (birlik.isEmpty() ? "" : " " + birlik));
    }
}

/* isEmpty() - bu stringni tekshiradi, boshmi yoki bosh
emasmi agar bosh bolsa shunda "" day chiqsin
degan ma'noni anglatadi */