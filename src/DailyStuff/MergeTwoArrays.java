package DailyStuff;

import java.util.Arrays;

public class MergeTwoArrays {


    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,6};
        int[] mergedArr = new int[arr1.length+arr2.length];
        int k = 0;

        for (int i = 0; i < arr1.length; i++, k++) {
                mergedArr[k] = arr1[i];
            }

        for (int i = 0; i < arr2.length; i++, k++) {
            mergedArr[k] = arr2[i];
        }

        System.out.println(Arrays.toString(mergedArr));

        }

}


/*
2. write a program that can merge two arrays of integers
        Ex:
            arr1 = {1,2,3,4}
            arr2 = {5,6}

        output
            arr3 = {1,2,3,4,5,6}

 */