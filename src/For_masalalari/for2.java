package For_masalalari;

import java.util.Scanner;

public class for2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("a<b");
        System.out.print("a=");
        int a=sc.nextInt();

        System.out.print("b=");
        int b=sc.nextInt();

        int c=0;
        for (int i=a; i<=b; i++){
            System.out.println(i);
            c++;
        }
        System.out.println("-----------");
      System.out.println("Sonlar yig'indisi => "+c);
    }
}
