package For_masalalari;

import java.util.Scanner;

public class for11 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("n = ");
        int n=sc.nextInt();

        int S=0;
        for (int i=0; i<=n; i++){
            int u=((i+n)*(i+n));
            S=+u;

        }
            System.out.println("Natija= "+S);
    }
}
