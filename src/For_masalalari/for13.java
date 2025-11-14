package For_masalalari;

import java.util.Scanner;

public class for13 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("n = ");
        int a=sc.nextInt();

        double S=0.0;

        for (int i=1; i<=a;i++){

            double b=1+(i/10.0);

            if(i%2==0) S-=b;
            else S+=b;

        }
        System.out.println("Natija : "+S);
    }
}
