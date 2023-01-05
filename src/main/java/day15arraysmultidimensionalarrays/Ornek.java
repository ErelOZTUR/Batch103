package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class Ornek {

    public static void main(String[] args) {


        int arr[] = {-12, 18, 0, 7, 9, 10};
        Arrays.sort(arr);
        int max = arr[arr.length - 1];
        int min = arr[0];


        System.out.println(Arrays.toString(arr));
        for (int w : arr) {
            if (w < 0) {
                max = Math.max(max,w);
            }
            if (w > 0) {
                min = Math.min(min,w);

            }

        }
        System.out.println(max + " and " + min);
    }
}
