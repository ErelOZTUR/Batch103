package day06nestedifswitch;

public class NestedIf01 {
    public static void main(String[] args) {
        /*
            Password'un ilk harfi büyük harf ise
                   'A' olursa geçerli password aksi halde geçersiz password
            Password'un ilk harfi küçük harf ise
                   'z' olursa geçerli password aksi halde geçersiz password

        Note: Java "nested" kodlari calistirirken cok zaman harcar, buna "Time Complexity" denir.
                Bu yuzden mumkunse "nested" kod yazmamaya calisiriz.*/

        String pwd = "Cxy12!";

        if (pwd.charAt(0) >= 'A' && pwd.charAt(0) <= 'Z') {

            if (pwd.charAt(0) == 'A') {
                System.out.println("Geçerli Password");
            } else {
                System.out.println("Geçersiz Password");
            }

        } else if (pwd.charAt(0) >= 'a' && pwd.charAt(0) <= 'z') {

            if (pwd.charAt(0) == 'z') {
                System.out.println("Geçerli Password");
            } else {
                System.out.println("Geçersiz Password");
            }

        } else {
            System.out.println("İlk karakter harf olmalıdır...");
        }
    }

}



