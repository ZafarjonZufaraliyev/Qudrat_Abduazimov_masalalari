package Case_masalalari;

import java.util.Scanner;

public class case18 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Son kiriting (100-999): ");
        int s=sc.nextInt();

        String brlik=switch (s%10){
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
        String onlik =switch ((s%100)/10){
            case 1 -> "o'n";
            case 2 -> "yigirma";
            case 3 -> "o'ttiz";
            case 4 -> "qriq";
            case 5 -> "ellik";
            case 6 -> "oltimish";
            case 7 -> "yetimish";
            case 8 -> "sakson";
            case 9 -> "to'qson";
            default -> "";
        };
        String yuzlik =switch (s/100){
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

        System.out.println(yuzlik+" "+"yuz"+(onlik.isEmpty()?"":" "+onlik)+(brlik.isEmpty()?"":" "+brlik));
    }



}
