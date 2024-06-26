package dev.ravi.ArrayExercise;

import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {

    public static void main(String[] args) {
        int[] array = getIntegers(5);
        printArray(array);

        int[] sortedArray = sortIntegers(array);
        System.out.println(Arrays.toString(sortedArray));
    }

    public static int[] getIntegers(int size) {

        int[] newArray = new int[size];
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < size; i++) {
            System.out.println("Enter " + i + " element for array: ");
            int number =  scanner.nextInt();
            newArray[i] = number;
        }

        return newArray;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {
        Arrays.sort(array);
        int[] newArray = Arrays.copyOf(array, array.length);
        for (int i = 0; i < newArray.length / 2; i++) {
            int temp = newArray[i];
            newArray[i] = newArray[newArray.length - 1 - i];
            newArray[newArray.length - 1 - i] = temp;
        }

        return newArray;
    }
}
