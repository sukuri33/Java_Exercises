package Day21_assignments;

import utilities.ArraysUtility;

import java.util.Arrays;

public class InsertTask {


    public static void main(String[] args) {

       int[] arr = {10, 20, 30, 40, 50};
       int index = 5;
       int element = 60;

       System.out.println(Arrays.toString(insertNewElement(arr,index,element)));
    }
        public static int[] insertNewElement(int[] arr, int index, int element) {
            int[] arrExtended = new int[arr.length+1];
            if (index == arr.length){
                arrExtended = Arrays.copyOf(arr,arr.length+1);
                arrExtended[arrExtended.length-1] = element;
            }else{
                for (int i = 0, j = 0 ; i <= arr.length; i++, j++) {
                    if (i == index){
                        arrExtended[i] = element;
                        i++;
                    } else if (i > index) {
                        arrExtended[i] = arr[j-1];
                    }
                    arrExtended[i] = arr[j];
                }
            }
            return arrExtended;
        }

    /**
     * Umran Ozman's solution
     */                                     // 3
    public static int[] insert(int[] arr,int index,int newEl) {
        int[] new_array = Arrays.copyOf(arr, arr.length + 1);
        for (int i = 0; i < arr.length + 1; i++) {
            if (i < index) {
                new_array[i] = arr[i];
            } else if (i == index) {
                new_array[i] = newEl;
            } else {
                new_array[i] = arr[i - 1];
            }
        }return new_array;
    }

    public static int[] insert1(int[] arr, int index, int newEl){
        int [] arr1= Arrays.copyOfRange(arr,0,index);
        int [] arr2= {newEl};
        int [] arr3= Arrays.copyOfRange(arr,index,arr.length);

        int [] new_array= ArraysUtility.merge(arr1,arr2);
        new_array=ArraysUtility.merge(new_array,arr3);

        return new_array;}
}

/*
3. Insert Task:
        1.1 Create a method named insert that passes three parameters:
        integer array, integer index, integer element.
        the method inserts the given element to the given index of the array
        and returns the new array
                Ex:
                    arr = {10, 20, 30, 40, 50};

                    insert(arr, 2, 100) ==> {10, 20, 100, 30, 40, 50}


        1.2 Create the same function for double array, char array and string array
 */
