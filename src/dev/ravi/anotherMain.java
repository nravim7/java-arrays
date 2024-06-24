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

        int[] largerArray = Arrays.copyOf(thirdArray, 20);
        System.out.println(Arrays.toString(largerArray));


        String[] sArray = {"Ravi", "Able", "Mark", "John"};
        Arrays.sort(sArray);
        if (Arrays.binarySearch(sArray, "Mark") >= 0) {
            System.out.println("Mark is found in the list");
        }

        int[] s1 = {1, 2, 3, 4, 5};
        int[] s2 = {1, 2, 3, 4, 5, 0};
        if (Arrays.equals(s1, s2)) {
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");
        }


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


