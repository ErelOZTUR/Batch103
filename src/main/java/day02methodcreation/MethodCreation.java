package day02methodcreation;

import jdk.swing.interop.SwingInterOpUtils;

public class MethodCreation {

    //main method icinde kullanacaginiz hersey "static" olmalidir.
    public static void main(String[] args) {

        System.out.println(toplamaYap(1.2, 5));

        System.out.println(ucSayiyiCarp(2,1.5,6));
        System.out.println(islemYap(1,2.5,5));
        System.out.println(islemYap(1,4,5
        ));



    }

    //Example 1: Toplama islemi yapan bir method olusturunuz
    public static double toplamaYap(double a, double b){
        return a+b;
    }

    //Example 2: Uc sayiyi birbiri ile carpan bir method olusturunuz
    public static double ucSayiyiCarp(double a, double b, double c){
        return a*b*c;
    }
    //Example 3: Uc sayidan ilk ikisini toplayıp üçüncü sayı ile çarpan bir method olusturunuz

    public static double islemYap(double a,double b,double c){
        return (a+b)*c ;





    }





}
