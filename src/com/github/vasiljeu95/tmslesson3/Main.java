package com.github.vasiljeu95.tmslesson3;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
//1
        /*int[] array = new int[15];

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
            System.out.println(array[i]);
        }
//2
        int[] array = new int[6];

        for (int i = 0; i < array.length; i++) {
            int a = 2;
            array[i] = i+a;
            System.out.println(array[i]);
        }*/
//3
        Integer[] array2 = new Integer[3];

        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }

        int[] a = new int[0];
        System.out.println(a);

        // тут  null но оно не выведет
        //int[]b;
        //System.out.println(b);

        int[]b = {1, 2, 3};
        int[]c = b;
        c[1]=10;
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(c));

        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }

        String someText = "Some text";

        for (int i = 0; i < someText.length(); i++) {
            char currentChar = someText.charAt(i);
            if (currentChar == ' ') {
                continue;
            }
            System.out.print(currentChar);
        }

        System.out.println();
        String text = "Str 141";

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (currentChar == '1' || currentChar == ' ') {
                continue;
            }
            System.out.print(currentChar);
        }

        System.out.println();
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            System.out.println(random.nextInt(-20, 20));
        }

    }
}
