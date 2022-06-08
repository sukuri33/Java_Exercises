package Day20_assignments;

public class DisplayUniqueElementInArry {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 1, 2, 4, 5, 5};
        String result = "";
        for (int i = 0; i < arr.length; i++) {
            int counter = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]){
                    counter++;
                }
            }
            if (counter == 1){ // if counter value is more than 1
                result += arr[i];
            }

        }
        System.out.println(result);

        }
}


/*
1. write a program that can multiply each odd number of an integer array by 2
                ex:
                    array = [1,2,3,4,5];

                output:
                    array =[2,2,6,4,10]

2. write a program that can merge two arrays of integers
        Ex:
            arr1 = {1,2,3,4}
            arr2 = {5,6}

        output
            arr3 = {1,2,3,4,5,6}


3. Write a program that can display the unique elements of an array of inetgers
        Ex:
            arr = {1, 2, 3, 1, 2, 4, 5, 5}

        output:
            3
            4
 */
