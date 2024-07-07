package dev.ravi.minimumElement;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumElement {
    public static void main(String[] args) {
        int[] userArray = readIntegers();
        System.out.println(Arrays.toString(userArray));
        int minimumValue = findMin(userArray);
        System.out.println("Minimum value is " + minimumValue);
    }

    public static int[] readIntegers(int listOfNumbers) {
        int[] array = new int[listOfNumbers];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < listOfNumbers; i++) {
            System.out.println("Enter " + i + " th number: ");
            int number = scanner.nextInt();
            array[i] = number;
        }
        return array;
    }

    private static int[] readIntegers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a list of integers, separated by commas: ");
        String input = scanner.nextLine();
        String[] splits = input.split(",");
        int[] values = new int[splits.length];
        for (int i = 0; i < values.length; i++) {
            values[i] = Integer.parseInt(splits[i].trim());
        }
        return values;
    }

    private static int findMin(int[] array) {
        int minimumValue = array[0];
        for (int element : array) {
            if (element < minimumValue) {
                minimumValue = element;
            }
        }
        return minimumValue;
    }
}


