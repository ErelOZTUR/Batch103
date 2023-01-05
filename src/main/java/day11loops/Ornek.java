package day11loops;

import java.util.Scanner;

public class Ornek {
    public static void main(String[] args) {
        //Example 3: Size verilen bir tamsayinin rakamlari toplamini bulunuz
//        Scanner input=new Scanner(System.in);
//        System.out.println("Lütfen tam sayı giriniz");
//        int a=input.nextInt();
//        a=Math.abs(a);
//        int sonuc=0;
//        for (int i =a; i>0;i=i/10      ) {
//
//            sonuc=sonuc+i%10;
//        }
//        System.out.println(sonuc);
        //Example 4: Size verilen bir String'i ters ceviren kodu yaziniz.

//        System.out.println("Herhangi bir yazı yazınız");
//        String a=input.nextLine();
//        String ters="";
//        for (  int i=a.length()-1        ;  i>-1    ;  i--  ){
//            char c =a.charAt(i);
//            ters=ters+c;
//        }
//        System.out.println(ters);
        //Example 3: Size verilen bir String'deki 'm' den onceki karakterleri yazdiriniz
        //           Luxemburg ==> Luxe
//        String str="Luxemburg";
//        for (int i=0 ;  i<str.length()    ;   i++        ){
//            char c =str.charAt(i);
//            if (c=='m'){
//                continue;
//            }
//            System.out.print(c);
//
        for ( int i=1  ; i<4  ;i++  ){
            System.out.println("Week:" + i);
            System.out.println();
            for (int k=1;k<7;k++){
                System.out.println("Day:" + k);
            }
        }
    }
}
