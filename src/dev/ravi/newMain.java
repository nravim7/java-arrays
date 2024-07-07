package dev.ravi;

public class newMain {
    public static void main(String[] name) {
        System.out.println("Hello");
        String[] myString = "Hello World".split(" ");
        printText(myString);
    }

    private static void printText(String... textList) {
        for (String t : textList) {
            System.out.println(t);
        }
    }
}
