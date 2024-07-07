package dev.ravi.minimumElement;

import java.util.Arrays;
import java.util.Scanner;

public class CodingExercise {
    public static void main(String[] args) {
        int length = readInteger();
        int[] enteredArray = readElements(length);
        System.out.println(Arrays.toString(enteredArray));
        int minimum = findMin(enteredArray);
        System.out.println("Minimum is " + minimum);
    }

    private static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many Integers you wish: ");
        int lengthOfArray = scanner.nextInt();
        return lengthOfArray;
    }

    private static int[] readElements(int lengthOfArray) {
        int[] integerArray = new int[lengthOfArray];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < integerArray.length; i++) {
            System.out.println("Enter the " + i + " th element for array : ");
            int element = scanner.nextInt();
            integerArray[i] = element;
        }
        return integerArray;
    }

    private static int findMin(int[] array) {
        int min = array[0];
        for (int el: array) {
            if (el < min) {
                min = el;
            }
        }
        return min;
    }
}
