package For_masalalari;

import java.util.Scanner;

public class for10 {
    public  static void main(String[] args){
        Scanner sc=new  Scanner(System.in);

        System.out.print("n= ");
        int n=sc.nextInt();
        double a=0;
        for (int i=1;i<=n;i++){
            a=a+(1.0/i);
        }
        System.out.println("Yig'indi = "+a);

    }
}
