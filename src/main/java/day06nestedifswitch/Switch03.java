package day06nestedifswitch;

import java.util.Scanner;

public class Switch03 {
    public static void main(String[] args) {
        //Kullanıcıdan islem ve iki tane sayı alarak islemin sonucunu ekrana yazdıran basit bir hesap makinası yapınız
        Scanner input = new Scanner(System.in);
        System.out.println("Islemi giriniz: +, -, *, /, %");
        char islem = input.next().charAt(0);

        System.out.println("Ilk sayıyı giriniz");
        double ilk = input.nextDouble();

        System.out.println("Ikinci sayıyı giriniz");
        double ikinci = input.nextDouble();

        switch (islem){

            case '+':
                System.out.println(ilk + ikinci);
                break;
            case '-':
                System.out.println(ilk - ikinci);
                break;
            case '*':
                System.out.println(ilk * ikinci);
                break;
            case '/':
                System.out.println(ilk / ikinci);
                break;
            case '%':
                System.out.println(ilk % ikinci);
                break;
            default:
                System.out.println("Bu işlem tanımlanmamıştır...");


        }




    }

}

