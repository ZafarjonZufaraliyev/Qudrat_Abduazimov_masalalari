package For_masalalari;

import java.util.Scanner;

public class for10 {
    public  static void main(String[] args){
        Scanner sc=new  Scanner(System.in);

        System.out.print("n= ");
        int n=sc.nextInt();
        double a=0;
        for (int i=1;i<=n;i++){
            a=(double) (1/i)+a;
        }
        System.out.println("Yig'indi = "+a);
        double e=10/3f;
        System.out.println(e);
    }
}
