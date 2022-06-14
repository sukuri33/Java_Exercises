package DailyStuff;

import java.util.*;

public class ReplitNexr3 {

    public static void main(String[] args) {

        String[] strArr = {"Alim","Malim"};
        ArrayList<String> nameList = new ArrayList<>();
        nameList.addAll(Arrays.asList(strArr));

        System.out.println(nameList);

        Integer[] intArr = {1,2,5,7};

        ArrayList<Integer> scoreList = new ArrayList<>(List.of(intArr));

        System.out.println("scoreList = " + scoreList);

    }

}
