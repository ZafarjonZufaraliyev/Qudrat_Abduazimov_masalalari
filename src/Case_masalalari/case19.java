package Case_masalalari;

import java.util.Scanner;
public class case19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Yilni kiriting (yil >= 1984): ");
        int yil = sc.nextInt();
        int yilFarq = yil - 1984;

        String rang;
        switch (yilFarq % 5) {
            case 0 -> rang = "Yashil";
            case 1 -> rang = "Qizil";
            case 2 -> rang = "Sariq";
            case 3 -> rang = "Oq";
            case 4 -> rang = "Qora";
            default -> rang = "Noma'lum";
        }
        String hayvon;
        switch (yilFarq % 12) {
            case 0 -> hayvon = "sichqon";
            case 1 -> hayvon = "sigr";
            case 2 -> hayvon = "yo'lbars";
            case 3 -> hayvon = "quyon";
            case 4 -> hayvon = "ajdar";
            case 5 -> hayvon = "ilon";
            case 6 -> hayvon = "ot";
            case 7 -> hayvon = "qoy";
            case 8 -> hayvon = "maymun";
            case 9 -> hayvon = "tovuq";
            case 10 -> hayvon = "it";
            case 11 -> hayvon = "to'ng'iz";
            default -> hayvon = "Noma'lum";
        }
        System.out.println(rang + " " + hayvon + " yili");
    }
}