package Day21_assignments;

import java.util.Arrays;

public class ReplaceAll {

    public static void main(String[] args) {

       int[] arr = {10, 10, 20, 30, 40, 30, 30, 30};
        double[] arrDouble = {10, 10, 20, 30, 40, 30, 30, 30};

        System.out.println(Arrays.toString(replace(arr,30,3000)));

        System.out.println(Arrays.toString(replace(arrDouble,10.00,11.00)));

    }
    private static int[] replace(int[] intArr, int oldElement, int newElement) {

        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i] == oldElement){
                intArr[i] = newElement;
            }
        }
        return intArr;
    }

    private static double[] replace(double[] doubleArr, double oldElement, double newElement) {

        for (int i = 0; i < doubleArr.length; i++) {
            if (doubleArr[i] == oldElement){
                doubleArr[i] = newElement;
            }
        }
        return doubleArr;
    }

}

/*
2. RecplaceAll Task:
        2.1 Create a method named replace that passes three parameters:
        integer array, integer oldElement, integer newElement.
        The method replaces all the element of the array that matching with the given old element with the given new element,
        and returns the new array.
            Ex:
                arr = {10, 10, 20, 30, 40, 30, 30, 30};

                replaceAll(arr, 30, 300) ==> {10, 10, 20, 300, 40, 300, 300, 300}

        2.2 Create the same functions for double arrays, char arrays, and String arrays
 */
