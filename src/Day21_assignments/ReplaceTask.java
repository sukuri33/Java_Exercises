package Day21_assignments;

import java.util.Arrays;

public class ReplaceTask {


    public static void main(String[] args) {

        int[] intArr = {1,2,3,4,5};
        int index = 2;
        int newElement = 30;

        System.out.println(Arrays.toString(replace(intArr,  index, newElement)));

        double[] doubleArr = {1.2,2.4,4.4,6.3,5.1};
        int index2 = 2;
        double newElement2 = 15.3;

        System.out.println(Arrays.toString(replace(doubleArr,  index2, newElement2)));

    }
    private static int[] replace(int[] intArr, int index, int newElement) {

        for (int i = 0; i < intArr.length; i++) {
            if (i == index){
                intArr[i] = newElement;
            }
        }
        return intArr;
    }

    private static double[] replace(double[] doubleArr, double index, double newElement) {

        for (int i = 0; i < doubleArr.length; i++) {
            if (i == index){
                doubleArr[i] = newElement;
            }
        }
        return doubleArr;
    }
}

/*
1. Replace Task:
        1.1 Create a method named replace that passes three parameters:
        integer array, integer index, integer newElement.
        The method replaces the element of the array at given index with the new element, and returns the new array.
                Ex:
                    arr = {1,2,3,4,5};

                    replace(arr, 2, 30) ===> {1, 2, 30, 4, 5}


        1.2 Create the same functions for double arrays, char arrays, and String arrays
 */
