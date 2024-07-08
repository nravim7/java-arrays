package dev.ravi.multiDimensionalArrays;

import java.util.Arrays;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        int[][] array2 = new int[2][3];
        System.out.println(Arrays.toString(array2));

        for (int[] outer: array2) {
            System.out.println(Arrays.toString(outer));
        }

        for (int i = 0; i < array2.length; i++) {
            var innerArray = array2[i];
            for (int j = 0; j < innerArray.length; j++) {
                array2[i][j] = (i * 10) + (j + 1);
            }
            System.out.println();
        }
        System.out.println(Arrays.deepToString(array2));
    }
}
