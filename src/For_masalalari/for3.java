package For_masalalari;

import java.util.Scanner;

public class for3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("a<b");
        System.out.print("a=");
        int a=sc.nextInt();

        System.out.print("b=");
        int b=sc.nextInt();

        for (int i=b-1; i>a; i--){

            System.out.println(i);

        }
    }
}
