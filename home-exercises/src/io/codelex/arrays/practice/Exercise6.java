package io.codelex.arrays.practice;

import java.util.Arrays;
import java.util.Random;

public class Exercise6 {
    public static void main(String[] args) {
        Random rn = new Random();
        int[] numArr = new int[10];
        int min = 1;
        int max = 100;
        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = rn.nextInt(max - min) + min;
        }
        System.out.println("Array 1: " + Arrays.toString(numArr));
        int[] numArr2 = numArr;
        for (int i = 0; i < numArr2.length; i++) {
            if (i == numArr2.length - 1) {
                numArr2[i] = -7;
            }

        }

        System.out.println("Array 2: " + Arrays.toString(numArr2));

    }
}
