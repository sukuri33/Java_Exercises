package Day19_assignments;

import java.util.Arrays;

public class ReverseIntArray {
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5};
        int[] reversedArr = new int[array.length];
        for (int i = array.length - 1, j = 0; i >= 0; i--) {
            reversedArr[j++] = array[i];
        }
        System.out.println(Arrays.toString(array));
    }
}

/*
6.  Write a program that can reverse an array of integers and returns it as new array
        ex:
            array = {1,2,3,4,5};

        output:
            reversedArray = {5,4,3,2,1};
 */
