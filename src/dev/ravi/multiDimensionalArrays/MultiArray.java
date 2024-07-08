package dev.ravi.multiDimensionalArrays;

import java.util.Arrays;

public class MultiArray {
    public static void main(String[] args) {
        int[][][] multiArray = new int[3][4][2];

        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                for (int k = 0; k < multiArray[i][j].length; k++) {
                    multiArray[i][j][k] = (i * 10) + (j + 1) + (k + 2);

                }
            }
        }

        System.out.println(Arrays.deepToString(multiArray));
    }
}
