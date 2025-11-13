package For_masalalari;

import java.util.Scanner;

public class for1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("n=");
        int n=sc.nextInt();

        System.out.print("k=");
        int k=sc.nextInt();
        for (int i=1; i<=n; i++){
            System.out.println(i+"-"+k);
        }
    }
}
