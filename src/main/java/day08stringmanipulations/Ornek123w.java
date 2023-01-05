package day08stringmanipulations;

import java.util.Scanner;

public class Ornek123w {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


//        String str ="Ben kedi, esim tavuk, oğlum sever inek";
//        String kedi=str.substring(4, 8);
//        System.out.println(kedi);

//        System.out.println("Ad ve Soyad giriniz");
//        String tanIsim=input.nextLine();
//
//        String bir =tanIsim.substring(0,1);
//        String iki = tanIsim.split(" ")[1].substring(0,1);
//        System.out.println(bir + iki);
//        String str="Ali okula gitti.";
//          int num=      str.replace(" ","").length();
//        System.out.println(num);

//        String id ="AS12345465789";
//        String sonuc =id.replaceAll("[0-9]","*");
//        System.out.println(sonuc);
//        String b =id.replace("A","m");
//        System.out.println(b);
        String u = "Ali 13 yasinda, dersem inanma!...";
     int yeniU=   u.
             replaceAll("\\p{Punct}","").
             replace(" ","").
             replaceAll("[0-9]","").
             length();
        System.out.println(yeniU);
    }
}
