package dev.ravi;

import java.util.Arrays;
import java.util.Random;

public class anotherMain {
    public static void main(String[] args) {

        int[] firstArray = getRandomArray(20);
        System.out.println(Arrays.toString(firstArray));
        Arrays.sort(firstArray);
        System.out.println(Arrays.toString(firstArray));

        int[] secondArray = new int[10];
        System.out.println(Arrays.toString(secondArray));
        Arrays.fill(secondArray, 5);
        System.out.println(Arrays.toString(secondArray));

        int[] thirdArray = getRandomArray(10);
        System.out.println(Arrays.toString(thirdArray));

        int[] fourthArray = Arrays.copyOf(thirdArray, thirdArray.length);
        Arrays.sort(fourthArray);
        System.out.println(Arrays.toString(fourthArray));

        int[] smallArray = Arrays.copyOf(thirdArray, 5);
        System.out.println(Arrays.toString(smallArray));


    }

    private static int[] getRandomArray(int length) {
        Random random = new Random();
        int[] newInt = new int[length];

        for (int i = 0; i < length; i++) {
            newInt[i] = random.nextInt(100);
        }

        return newInt;
    }
}


