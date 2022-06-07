package DailyStuff;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        int[] iArr = {1,2,3,4,5};
        int[] reversedArr = new int[iArr.length];
        for (int i = iArr.length - 1, j = 0 ; i >= 0; i-- , j++) {
            reversedArr[j] = iArr[i];
        }

        /*
            for (int i = iArr.length - 1, j = 0 ; i >= 0; i-- ) {
            reversedArr[j++] = iArr[i]; //j++ is the difference with above code
                                        // post plus meaning 1st
                                        //iteration it will have the original value
        }
         */

        System.out.println(Arrays.toString(reversedArr));

    }

}
