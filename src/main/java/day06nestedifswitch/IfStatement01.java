package day06nestedifswitch;

import java.util.Scanner;

public class IfStatement01 {
    public static void main(String[] args) {

        //Kullanıcıdan yaş değerini alan kodu yazınız ve yaşın hangi aralıkta olduğunu aşağıdaki tabloya göre ekrana yazdırın
        //0 - 4 => baby
        //5 - 12 => child
        //13 - 20 => teenager
        //21 - 30 => adult
        //tanımlanmamış evre

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz..");
        byte yas=input.nextByte();

        if(yas<0){
            System.out.println("Gecerli yas giriniz");
        }else if(yas<5){
            System.out.println("Bebek");
        }else if(yas<13){
            System.out.println("Cocuk");
        }else if(yas<21){
            System.out.println("Genc");
        }else if(yas<31){
            System.out.println("Yetiskin");
        }else{
            System.out.println("Tanimlanmamis evre...");
        }
    }

}


