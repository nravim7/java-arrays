package dev.ravi;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] myIntArray = new int[10];
        myIntArray[0] = (int) 45.0;
        myIntArray[1] = Integer.parseInt("1");
        myIntArray[5] = 50;

        double[] myDoubleArray = new double[10];
        myDoubleArray[0] = 20.5;

        System.out.println(myDoubleArray[0]);

        int[] firstTen = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("first = " + firstTen[0]);
        int arrayLength = firstTen.length;
        System.out.println("length of array = " + arrayLength);
        System.out.println("last = " + firstTen[arrayLength - 1]);

        int[] newArray;
//        newArray = new int[] {2, 4, 6, 8, 10};
        newArray = new int[5];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = newArray.length - i;
        }
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }

        System.out.println();

        System.out.print("-".repeat(10));
        System.out.println();
        for (int element : newArray) {
            System.out.print(element + " ");
        }

        System.out.println();
        System.out.println(Arrays.toString(newArray));
    }
}
