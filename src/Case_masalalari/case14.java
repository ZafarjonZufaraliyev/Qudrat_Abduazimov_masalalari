package Case_masalalari;

import java.util.Scanner;

public class case14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qaysi amalni bajarasi : ");
        System.out.println("1-Tomoni (a)");
        System.out.println("2-Ichki chizilgan aylana (R1)");
        System.out.println("3-Tashqi chizilgan aylana (R2)");
        System.out.println("4-Yuzi (S)");
        System.out.print(">>>");
        int e=sc.nextInt();
        double R1, a, R2, S;

        switch (e){
            case 1:
                System.out.println("1-Tomoni (a)");
                a=sc.nextDouble();

                R1=(a*Math.sqrt(3))/6;
                R2=2*R1;
                S=(Math.pow(a,2)*Math.sqrt(3))/4;

                System.out.println("Ichki aylana radus (R1) =>"+R1);
                System.out.println("Tashqi chizilgan aylana (R2) =>"+R2);
                System.out.println("Yuzi (S) =>"+S);
                break;
            case 2:
                System.out.println("2-Ichki chizilgan aylana (R1)");
                R1=sc.nextDouble();

                a=R1/Math.sqrt(3)/6;
                R2=R1*2;
                S=(Math.pow(a,2)*Math.sqrt(3))/4;

                System.out.println("Tomoni (a) =>"+a);
                System.out.println("Tashqi chizilgan aylana (R2) =>"+R2);
                System.out.println("Yuzi (S) =>"+S);
                break;
            case 3:
                System.out.println("3-Tashqi chizilgan aylana (R2)");
               R2=sc.nextDouble();

               R1=R2/2;
               a=(6*R1)/Math.sqrt(3);
               S=(Math.pow(a,2)*Math.sqrt(3))/4;

               System.out.println("Ichki aylana radus (R1) =>"+R1);
               System.out.println("Tomoni (a) =>"+a);
               System.out.println("Yuzi (S) =>"+S);
               break;
            case 4:
                System.out.println("4-Yuzi (S)");
                S=sc.nextDouble();

                a=(2*Math.sqrt(S))/Math.pow(3,1/4);
                R1=a*Math.sqrt(3)/6;
                R2=2*R1;

                System.out.println("Ichki aylana radus (R1) =>"+R1);
                System.out.println("Tomoni (a) =>"+a);
                System.out.println("Tashqi chizilgan aylana (R2) =>"+R2);



        }
    }
}
