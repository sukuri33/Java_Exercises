package Day21_assignments;

import java.util.Arrays;

public class Anagram {


    public static void main(String[] args) {

        String word1 = "heart";
        String word2 = "earth";

        String[] word1Arr = word1.split("");
        String[] word2Arr = word2.split("");
        Arrays.sort(word1Arr);
        Arrays.sort(word2Arr);

        System.out.println(Arrays.equals(word1Arr, word2Arr));

    }
}
