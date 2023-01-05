package day12loops;

public class Ass {
    public static void main(String[] args) {
        //Example 4: Size verilen bir tamsayinin rakamlari toplamini ekrana yazdiran kodu yaziniz
        int sonuc=0;
        int a=385;
        while (a>0){

          sonuc=sonuc+a%10;

            a=a/10;

        }

        System.out.println(sonuc);
    }
}
