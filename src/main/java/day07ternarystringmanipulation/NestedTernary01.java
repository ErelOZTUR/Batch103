package day07ternarystringmanipulation;

public class NestedTernary01 {
    public static void main(String[] args) {

        /*
            Verilen yilin "Leap Year"(Artik Yil) olup olmadigini kontrol eden kodu yaziniz.
                i)Yil 100 e bolunurse 400 e de bolunmelidir ==> 1600+    1800-
                ii)Yil 100'e bolunmezse 4 e bolunmelidir ==> 1996+    2001-
         */
        int year=1700;
       String leap = year%100==0 ? (year%400==0 ? "Leap year" : "Leap year değil") : (year%4==0 ? "Leap year" : "Leap year değil") ;
        System.out.println(leap);


        int yea = 2000;

        String leaps = yea%100==0 ? (yea%400==0 ? "Leap year" : "Leap year degil") : (yea%4==0 ? "Leap year" : "Leap year degil");


        System.out.println(leaps);

        /*
            Asagidaki kurallara gore password'un gecerli olup olmadigini kontrol eden kodu yaziniz
            i)Sekiz karakterden fazla veya sekiz karakter varsa ilk harfi 'i' olmalidir
            ii)Sekiz karakterden az karakter varsa ilk harfi 'K' olmalidir
        */

        String pwd = "K22a3ed";
        char ilkHarf = pwd.charAt(0);

        String gecerli = pwd.length() < 8 ? (ilkHarf == 'K' ? "Geçerli" : "Geçersiz") : (ilkHarf == 'i' ? "Geçerli" : "Geçersiz");
        System.out.println(gecerli);
    }
}
