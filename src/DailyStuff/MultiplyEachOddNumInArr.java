package DailyStuff;

import java.util.Arrays;

public class MultiplyEachOddNumInArr {

    public static void main(String[] args) {

        int[] myArr = {1,2,3,4,5};
        int[] newArr = new int[myArr.length];

        for (int i = 0; i < myArr.length; i++) {
            newArr[i] = myArr[i]*2;
        }

        System.out.println(Arrays.toString(newArr));

    }


}


/*
1. write a program that can multiply each odd number of an integer array by 2
                ex:
                    array = [1,2,3,4,5];

                output:
                    array =[2,2,6,4,10]
 */