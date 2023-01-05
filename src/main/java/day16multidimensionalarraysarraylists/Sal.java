package day16multidimensionalarraysarraylists;

import java.util.Arrays;

public class Sal {
    public static void main(String[] args) {
        int brr[][] = {{2, 5, 1}, {32, 75}};
        int toplam = 0;
        for (int[] w : brr) {
            toplam = toplam + w.length;

        }
        System.out.println(toplam);

        int yeni[] = new int[toplam];
        int idx = 0;
        for (int[] w : brr) {
            for (int k : w) {
                yeni[idx] = k;
                idx++;
            }

            System.out.println(Arrays.toString(yeni));
        }

    }
}

