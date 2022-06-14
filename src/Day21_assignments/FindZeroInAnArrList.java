package Day21_assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindZeroInAnArrList {

    public static void main(String[] args) {
        ArrayList<Integer> largest = new ArrayList<>();
        largest.addAll(Arrays.asList(1,2,3,4,5,6,7,7,8,8));
        int n=5;
        int largestN=0;
        Collections.sort(largest);
        ArrayList<Integer> nonDup = new ArrayList<>();
        for (Integer each : largest) {
            if(nonDup.contains(each)){
                continue;
            }
            nonDup.add(each);
        }
        largest = nonDup;
        largestN=nonDup.get(nonDup.size()-n);

        System.out.println(largestN);
    }
}
