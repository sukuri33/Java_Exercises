package Day21_assignments;

import java.util.Arrays;

public class SwapTask {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};
        int[] arr1 = {10, 20, 30, 40, 50};
        System.out.println(Arrays.toString(swappedArr(arr, 0, 4)));

    }

    public static int[] swappedArr(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return arr;
    }

}

/*
4. Swap Task:
    2.1 Create a method named swap that passes three parameters: integer array, integer i, integer j. the method swaps the element at index i with the element at index j, and returns the new array
            Ex:
                arr = {10, 20, 30, 40, 50};

                swap(arr, 2, 4) ==>  {10, 20, 50, 40, 30}

    2.2 Create the same function for double array, char array and string array
 */