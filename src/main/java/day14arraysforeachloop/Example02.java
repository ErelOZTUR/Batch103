package day14arraysforeachloop;

import java.util.Arrays;

public class Example02 {

    public static void main(String[] args) {

// Example 1: [0, 2, 3, 0, 12, 0] sifirlari en sona koyunuz
        //            [2, 3, 12, 0,  0,  0]
        int original[]={0, 2, 3, 0, 12, 0};
         int yeni[]=new int[original.length];

         int idx=0;

         for (int i=0;i< original.length;i++){
             if (original[i] !=0){
                 yeni[idx]=original[i];
                 idx++;
             }
         }
        System.out.println(Arrays.toString(yeni));

        //Example 2: Bir Array'in icinde herhangi bir elemanin olup olmadigini kontrol eden ve kac kere tekrarlandigini gosteren kodu yaziniz
        //           [ 2, 1, 2, -3, 2] ==> Kullanici 2'yi sordu ==> 2 elemani var ve 3 kere tekrarlandi
        //                             ==> Kullanici 6'yi sordu ==> 6 array'de yok
        int arr[]={2, 1, 2, -3, 2};
        int eleman=5;
        int counter=0;
        for (int w:arr ){
            if (w==eleman){
                counter++;
            }

        }
        if (counter>0){
            System.out.println(eleman + " array de " + counter + " kadar var" );

        }else {
            System.out.println(eleman+ " arrayda yok");
        }
    }
}
