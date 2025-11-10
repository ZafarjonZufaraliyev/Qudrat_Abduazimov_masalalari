package Case_masalalari;

import java.util.Scanner;

public class case11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Boshlang'ich holati (s, j, q, g') = ");
        String start = sc.nextLine();

        System.out.print("Harakat 1 (0-o'nga, 1-chap, 2-180°) = ");
        int k1 = sc.nextInt();

        System.out.print("Harakat 2 (0-o'nga, 1-chap, 2-180°) = ");
        int k2 = sc.nextInt();

        String direction = start;

        switch (start) {
            case "s":
                if(k1 == 0){
                    direction = (k2 == 0) ? "Sharq" : (k2 == 1) ? "Shimol" : "Janub";
                } else if(k1 == 1){
                    direction = (k2 == 0) ? "Shimol" : (k2 == 1) ? "G‘arb" : "Janub";
                } else if(k1 == 2){
                    direction = (k2 == 0) ? "Janub" : (k2 == 1) ? "G‘arb" : "Shimol";
                }
                break;

            case "j":
                if(k1 == 0){
                    direction = (k2 == 0) ? "G‘arb" : (k2 == 1) ? "Janub" : "Shimol";
                } else if(k1 == 1){
                    direction = (k2 == 0) ? "Janub" : (k2 == 1) ? "Sharq" : "Shimol";
                } else if(k1 == 2){
                    direction = (k2 == 0) ? "Shimol" : (k2 == 1) ? "Sharq" : "Janub";
                }
                break;

            case "q":
                if(k1 == 0){
                    direction = (k2 == 0) ? "Janub" : (k2 == 1) ? "Sharq" : "G‘arb";
                } else if(k1 == 1){
                    direction = (k2 == 0) ? "Sharq" : (k2 == 1) ? "Shimol" : "G‘arb";
                } else if(k1 == 2){
                    direction = (k2 == 0) ? "G‘arb" : (k2 == 1) ? "Shimol" : "Sharq";
                }
                break;

            case "g'":
                if(k1 == 0){
                    direction = (k2 == 0) ? "Shimol" : (k2 == 1) ? "G‘arb" : "Janub";
                } else if(k1 == 1){
                    direction = (k2 == 0) ? "G‘arb" : (k2 == 1) ? "Sharq" : "Janub";
                } else if(k1 == 2){
                    direction = (k2 == 0) ? "Janub" : (k2 == 1) ? "Sharq" : "G‘arb";
                }
                break;

            default:
                System.out.println("Xato boshlang'ich holat!");
                return;
        }

        System.out.println("Oxirgi yo‘nalish: " + direction);
    }
}
