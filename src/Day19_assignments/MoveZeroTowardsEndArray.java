package Day19_assignments;

import java.util.Arrays;

public class MoveZeroTowardsEndArray {

    public static void main(String[] args) {

        int[] array = {10, 0, 5, 0, 1, 0};
        int[] sortedArr = new int[array.length];
        int j = 0;
/*
       for (int i = 0; i < array.length; i++) {
            if (array[i] != 0){
                sortedArr[j] = array[i];
                j++;
            }
        }*/

        for (int i : array) {
            if(i!=0){
                sortedArr[j++] = i;
            }
        }
        System.out.println(Arrays.toString(sortedArr));
    }
}


/*
7. write a program that can move all the zeros to the end of the array
        Ex:
            array = {10, 0, 5, 0, 1, 0};

            output:
                 {10, 5, 1, 0, 0, 0}
 */
