package day13loopsarrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ornem {
    public static void main(String[] args) {
int stdAges[]=new int[7];
        stdAges[1] = 11;
        stdAges[0] = 12;
        stdAges[2] = 13;
        stdAges[3] = 14;
        stdAges[4] = 10;
        stdAges[5] = 12;
        stdAges[6] = 12;
        System.out.println(Arrays.toString(stdAges));
        System.out.println(stdAges[4]);

        Arrays.sort(stdAges);
        System.out.println(Arrays.toString(stdAges));

    }
}
