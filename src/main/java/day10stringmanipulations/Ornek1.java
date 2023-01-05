package day10stringmanipulations;

public class Ornek1 {
    public static void main(String[] args) {
//        for (int i =28;i<158;i=i+1){
//            if (i%2!=0){
//                System.out.print(i+" ");
//            }
//        }
//
//        System.out.println();
//        //Example 7: "Java" String'ini "J*a*v*a*" String'ine ceviren kodu yaziniz
//        String str="Java is easy";
//        for (int i =0;i<str.length();i++){
//            System.out.print(str.charAt(i)+ "*");
//        }
        System.out.println();
//        //Example 8: Size verilen String'de tekrarsiz karakterleri ekrana yazdiriniz
//        //           "Hellooo Ali" ==> He Ai
        String s ="Hellooo Ali";
        for (int i=0;i<s.length();i++){

            char c =s.charAt(i);

            if (s.indexOf(c)==s.lastIndexOf(c)){
                System.out.print(c);
            }
        }
















    }
}
