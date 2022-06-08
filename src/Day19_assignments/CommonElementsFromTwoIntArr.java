package Day19_assignments;

public class CommonElementsFromTwoIntArr {

    public static void main(String[] args) {

      int[] arr1 = {1,2,3,4,5,10};
      int[] arr2 = {4,5,6,7,8,10};
        String temp = "";
        for (int i : arr1) {
            for (int j : arr2) {
                if (i == j){
                    temp += " "+i;
                }
            }
        }
        System.out.println(temp);

        /*
        for (int each : arr1) {
            if (Arrays.toString(arr2).contains(each + "")) {
                System.out.print(each+" ");
            }
         */

    }

}



/*
8. Write a program that can print out the common elements from two integer array
          Ex:
              arr1: {1,2,3,4,5}
              arr2: {4,5,6,7,8}

          output:
              4 5

           Use for each as well
 */