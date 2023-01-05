package day07ternarystringmanipulation;

public class Ternary01 {

    public static void main(String[] args) {

        //Example 1: Bir sayinin pozitif olup olmadığını ekrana yazdiran kodu yaziniz

        //1.way
        int a = -12;
        if (a > 0) {
            System.out.println("Pozitif");
        } else {
            System.out.println("Pozitif değil");
        }
        //2.yol
               //condition ? cpndition doğru is uygulanacak kod : Condition yanlış ise uygulanacak kod
        String sonuc = a>0 ? "Pozitif"                          : "Pozitif değil";
        System.out.println(sonuc);

        //example 2 : iki sayıdan küçük olanı seçen kodu yazın
        int b =23;
        int c =23;
        int min = b<c ? b : c ;
        System.out.println(min);
        //Ex 3: Verilen bir sayinin mutlak degerini hesaplayan kodu yaziniz
        //      Pozitif sayilarin ve sifirin in mutlak degeri kendileridir
        //      Negatif sayilarin mutlak degeri -1 ile carpilmis halleridir

        int d = -45;

        int abs = d<0 ? -1*d : d;

        System.out.println(abs);

        //Ex 4: Iki tane sayi ayni isaretli ise bu sayilari carpiniz,farkli isaretli ise "Islem yapamam" mesaji veriniz

        int e = 12;
        int f = 10;

        //Ternary farkli data tiplerinde sonuc return ederse sonucun data tipini "Object" yapiniz
        Object islem =(e>0 && f>0) || (e<0 && f<0) ? e*f:"Islem yapamam";
        System.out.println(islem);

        //Note: Javada her classin en az bir tane "parent" classi vardir.
        //      Sadece "Object" class'in "parent" class'i yoktur.


    }
}
