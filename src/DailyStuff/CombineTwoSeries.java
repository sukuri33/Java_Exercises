package DailyStuff;

import java.util.*;

public class CombineTwoSeries {


    public static void main(String[] args) {

        Map<Integer,Double> map1 = new HashMap<>();
        map1.put(1,1.0);
        map1.put(2,1.5);
        map1.put(3,2.0);

        Map<Integer,Double> map2 = new HashMap<>();
        map2.put(2,1.0);
        map2.put(3,2.5);
        map2.put(5,1.0);
    }
    //solution1
    public static Map<Integer,Double > combineSeries(Map<Integer,Double > map1, Map<Integer,Double > map2  ) {
        map2.forEach((key,value)-> map1.put(key,map1.getOrDefault(key,0.0)+value) );
        return map1;
    }
    //solution2
    public static Map<Integer,Double > combineSeries2(Map<Integer,Double > map1, Map<Integer,Double > map2  ){
        // Algorithm
        //add all the entries of map 1 to the sum (the third map)
        //iterate map2 and check if the sum map not contains the key add the entry to the sum
        //if it contains the key add the value to the existing value
        Map<Integer, Double> sum = new LinkedHashMap<>();
        sum.putAll(map1);
        for (Integer eachKey : map2.keySet()) {
            if( !(sum.containsKey(eachKey)) ){
                sum.put(eachKey,map2.get(eachKey));
            }else{
                sum.put(eachKey,map2.get(eachKey)+sum.get(eachKey));
            }
        }
        System.out.println(sum);
        return sum;
    }



}
