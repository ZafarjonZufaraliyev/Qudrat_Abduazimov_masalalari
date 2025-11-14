package For_masalalari;

import java.util.Scanner;

public class for7 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("a= ");
        int a=sc.nextInt();

        System.out.print("b= ");
        int b= sc.nextInt();

        int c=0;
        for (int i=a; i<=b; i++){
            c=i+c;
        }
        System.out.println("Barcha sonlar yi'indisi adan bgacha = > "+c);
    }
}
