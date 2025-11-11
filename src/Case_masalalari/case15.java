package Case_masalalari;

import java.util.Scanner;

public class case15 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("G'ish");
        System.out.println("Olma");
        System.out.println("Chillik");
        System.out.println("Qarg'a");
        System.out.print("Karta turi (M) >>>");
        int n=sc.nextInt();

        System.out.println("Karta qiymati (N)= ");
        int m=sc.nextInt();

        String b="g'ish";
        String d="olma";
        String e="chillik";
        String g="qarg'a";

        switch (n){
            case 1:
                if(m==6) {
                    System.out.println(m+" "+b);
                }
                else if(m==7) System.out.println(m+" "+b);
                else if(m==8) System.out.println(m+" "+b);
                else if(m==9) System.out.println(m+" "+b);
                else if(m==10) System.out.println(m+" "+b);
                else if(m==11) {
                    String nom="valet";
                    System.out.println(nom+" "+b);
                }
                else if(m==12) {
                    String nom="dama";
                    System.out.println(nom+" "+b);
                }
                else if(m==13) {
                    String nom="qirol";
                    System.out.println(nom+" "+b);
                }
                else if(m==14) {
                    String nom="tuz";
                    System.out.println(nom+" "+b);
                }
                break;
            case 2:
                if(m==6) {
                    System.out.println(m+" "+d);
                }
                else if(m==7) System.out.println(m+" "+d);
                else if(m==8) System.out.println(m+" "+d);
                else if(m==9) System.out.println(m+" "+d);
                else if(m==10) System.out.println(m+" "+d);
                else if(m==11) {
                    String nom="valet";
                    System.out.println(nom+" "+d);
                }
                else if(m==12) {
                    String nom="dama";
                    System.out.println(nom+" "+d);
                }
                else if(m==13) {
                    String nom="qirol";
                    System.out.println(nom+" "+d);
                }
                else if(m==14) {
                    String nom="tuz";
                    System.out.println(nom+" "+d);
                }
                break;
            case 3:
                if(m==6) {
                    System.out.println(m+" "+e);
                }
                else if(m==7) System.out.println(m+" "+e);
                else if(m==8) System.out.println(m+" "+e);
                else if(m==9) System.out.println(m+" "+e);
                else if(m==10) System.out.println(m+" "+e);
                else if(m==11) {
                    String nom="valet";
                    System.out.println(nom+" "+e);
                }
                else if(m==12) {
                    String nom="dama";
                    System.out.println(nom+" "+e);
                }
                else if(m==13) {
                    String nom="qirol";
                    System.out.println(nom+" "+e);
                }
                else if(m==14) {
                    String nom="tuz";
                    System.out.println(nom+" "+e);
                }
                break;
            case 4:
                if(m==6) {
                    System.out.println(m+" "+g);
                }
                else if(m==7) System.out.println(m+" "+g);
                else if(m==8) System.out.println(m+" "+g);
                else if(m==9) System.out.println(m+" "+g);
                else if(m==10) System.out.println(m+" "+g);
                else if(m==11) {
                    String nom="valet";
                    System.out.println(nom+" "+g);
                }
                else if(m==12) {
                    String nom="dama";
                    System.out.println(nom+" "+g);
                }
                else if(m==13) {
                    String nom="qirol";
                    System.out.println(nom+" "+g);
                }
                else if(m==14) {
                    String nom="tuz";
                    System.out.println(nom+" "+g);
                }
                break;
            default:
                System.out.println("Xatoda!!!");
        }
    }
}
