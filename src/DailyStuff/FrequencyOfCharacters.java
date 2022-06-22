package DailyStuff;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

        String str = "aabcccd";
        String result = ""; //a2b1c3d1

        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j); // each character from string
            int count = 0;
            for (int i = 0; i < str.length(); i++) { //to find the frequency of each character
                char each = str.charAt(i); // each character of str
                if (ch == each) {
                    count++;
                }
            }
            if (result.contains("" + ch)) {
                continue;
            }
            result += ch;
            result += count;
        }

        System.out.println(result);

        System.out.println(countLetters(str));
    }

    //My solution
    public static String countLetters(String str){

        String temp;
        int letterCount;
        String result = "";
        while (str.length() != 0){
            String letter = str.substring(0,1);
            temp = str.replaceAll(letter,"");
            letterCount = str.length() - temp.length();
            result += letter+letterCount;
            str = temp;
        }
        return result;
    }


}

/*
Write a program that can find the frequency of the characters from a string

                         Ex:
                        str = "aabcccd";

                        output:
                                a2b1c3d1


            Hint: if you find out how to find the frequency of one character, then repeat it
                    for all the remaining characters
 */

