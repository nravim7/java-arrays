package dev.ravi;

import java.util.Arrays;
import java.util.Random;

public class sortMain {
    public static void main(String[] args) {
//        Random random = new Random();
//        int[] newArray = new int[5];
//        for (int i =0 ; i < newArray.length; i++) {
//            newArray[i] = random.nextInt(100);
//        }
//
//        System.out.println(Arrays.toString(newArray));
//        Arrays.sort(newArray);
//
//        System.out.println(Arrays.toString(newArray));
//
//        int[] anotherArray = Arrays.copyOf(newArray, newArray.length);
//
//        for (int i = 0; i < newArray.length / 2; i++) {
//            int temp = newArray[i];
//            newArray[i] = newArray[newArray.length - 1 -i];
//            newArray[newArray.length - 1 -i] = temp;
//
//        }
//
//        System.out.println(Arrays.toString(newArray));

        int[] myArray = randomArray(10);
        int[] sortedArray =  sortedArray(myArray);
        System.out.println(Arrays.toString(sortedArray));


    }

    public static int[] randomArray(int length) {
        Random random = new Random();
        int[] newArray = new int[length];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = random.nextInt(100);
        }

        return newArray;
    }

    private static int[] sortedArray(int[] array) {

        int temp;
        boolean flag = true;

        while (flag) {
            flag = false;

            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] < array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return array;
    }

}
