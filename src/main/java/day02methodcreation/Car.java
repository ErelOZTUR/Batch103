package day02methodcreation;

public class Car {

    public String marka= "Honda" ;
    public int fiyat = 20000 ;
    public static void main(String[] args) {

        //Object nasıl oluşturulur
        Car  myHonda = new Car();
        System.out.println(myHonda.fiyat);
        System.out.println(myHonda.marka
        );
       myHonda.hareketEt();
       myHonda.dur();


        MethodCreation myobject = new MethodCreation();


    }

    public void hareketEt(){
        System.out.println("Honda güzel hareket eder..");

    }

    public void dur(){
        System.out.println("Honda güzenli durur.");

    }




}
