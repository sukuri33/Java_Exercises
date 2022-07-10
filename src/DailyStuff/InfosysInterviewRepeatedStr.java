package DailyStuff;

import java.util.HashMap;
import java.util.Set;

public class InfosysInterviewRepeatedStr {

    public static void main(String[] args) {

        String str = "institution";

        String temp = "";
        int letterCount = 0;
        String result = "";
        int counter = 0;
        while (str.length() != 0){
            String letter = str.substring(0,1);
            temp = str.replaceAll(letter,"");
            letterCount = str.length() - temp.length();
            if (letterCount != 1)
            result += " "+letter+"="+letterCount;
            str = temp;
        }
        System.out.println(result);


        duplicateCharCount("institution");

    }

    static void duplicateCharCount(String inputString)
    {
        //Creating a HashMap containing char as key and it's occurrences as value

        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();

        //Converting given string to char array

        char[] strArray = inputString.toCharArray();

        //checking each char of strArray

        for (char c : strArray)
        {
            if(charCountMap.containsKey(c))
            {
                //If char is present in charCountMap, incrementing it's count by 1

                charCountMap.put(c, charCountMap.get(c)+1);
            }
            else
            {
                //If char is not present in charCountMap,
                //putting this char to charCountMap with 1 as it's value

                charCountMap.put(c, 1);
            }
        }

        //Getting a Set containing all keys of charCountMap

        Set<Character> charsInString = charCountMap.keySet();

        System.out.println("Duplicate Characters In "+inputString);

        //Iterating through Set 'charsInString'

        for (Character ch : charsInString)
        {
            if(charCountMap.get(ch) > 1)
            {
                //If any char has a count of more than 1, printing it's count

                System.out.println(ch +" : "+ charCountMap.get(ch));
            }
        }
    }

}
