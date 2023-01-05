package day07ternarystringmanipulation;

public class Ornek {

    public static void main(String[] args) {

int a =-12;
       String sonuc= a>0 ? "Pozitif ": "Pozitif değil";

        System.out.println(sonuc);
        int b =13;
        int c =-25;
        int v = b<c ? b : c ;
        System.out.println(v);

        int d = -45;
        int asd = d<0 ? -1*d : d ;
        System.out.println(asd);
     //Example 4 :iki tane sayı aynı işaretli ise bu sayıları çarpınız.farkl ise "Islem yapamam" mesajı veriniz.
        int e =12;
        int f =-10;
       Object asdf = (e>0 && f>0) || (e<0 && f<0) ? e*f : "Islem yapamam";
        System.out.println(asdf);

        /*
                Bir password'un gecerli olup olmadigini asagidaki kurallara gore kontrol eden kodu yaziniz.
                            i)En az 8 character icermeli
                            ii)Space characteri icermemeli
                            iii)Ilk harfi "M" veya "m" olmali
                            iv)Son characteri "?" olmali

         */

        String pwd ="masaya12";
        boolean first =pwd.length()>7;
        boolean second=!pwd.contains(" ");
        boolean third =(pwd.charAt(0)=='M') || (pwd.charAt(0)=='m');
        boolean dort =pwd.length()-1=='m';
        System.out.println(first && second && third && dort);
    }
}
