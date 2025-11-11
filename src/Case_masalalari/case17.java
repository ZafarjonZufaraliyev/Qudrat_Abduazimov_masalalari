package Case_masalalari;

import java.util.Scanner;

public class case17 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Masala raqami (10-40): ");
        int m=sc.nextInt();

        String onlik=switch (m/10){
            case 1 -> "o'n";
            case 2 -> "yigirma";
            case 3 -> "o'ttiz";
            case 4 -> "qriq";
            default -> "";
        };

        String brlik=switch (m%10){
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

        System.out.println(onlik+(brlik.isEmpty()?"":" "+brlik+"ta"+" "+"masala"));
    }
}
