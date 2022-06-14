package Day21_assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeTwoArrays {


    public static void main(String[] args) {
        String[] arr1 = {"A", "B", "C"};
        String[] arr2 = {"D", "E", "F", "G"};
        ArrayList<String> convertedToArrListArr = new ArrayList<>(Arrays.asList(arr1));
        convertedToArrListArr.addAll(Arrays.asList(arr2));
        System.out.println(convertedToArrListArr);
    }
}

/*
7. write a program that can combine two String arrays into one arrayList
                ex:
                    arr1 = {"A", "B", "C"};
                    arr2 = {"D", "E", "F", "G"};
                    list ==> {"A", "B", "C", "D", "E", "F", "G"}
 */