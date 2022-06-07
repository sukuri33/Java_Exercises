package DailyStuff;

import java.util.Arrays;

public class MultiplyEachOddNumInArr {

    public static void main(String[] args) {

        int[] myArr = {1,2,3,4,5};


        for (int i = 0; i < myArr.length; i++) {

            if (myArr[i] % 2 != 0){
                myArr[i] = myArr[i]*2;
            }
        }

        System.out.println(Arrays.toString(myArr));

    }

}


/*
1. write a program that can multiply each odd number of an integer array by 2
                ex:
                    array = [1,2,3,4,5];

                output:
                    array =[2,2,6,4,10]
 */