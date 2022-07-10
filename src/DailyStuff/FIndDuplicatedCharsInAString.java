package DailyStuff;

public class FIndDuplicatedCharsInAString {







    public static void main(String[] args) {

        String str = "I love java java";
        str = str.replaceAll(" ","");
        String result = ""; //This will store final result
        char[] temp = str.toCharArray();//convert string into char array
//This code works!
        for (int j = 0; j < str.length(); j++) { //1st loop to grap 1 char to compere with rest of the char
            char ch = temp[j]; // each character from string
            if (Character.isDigit(ch)){ //if given char is a numaric value skip loop/compering
                continue;
            }
            int count = 0;//this is to count
            for (int i = 0; i < str.length(); i++) { //to find the frequency of each character
                char each = temp[i]; // each character of str
                if (ch == each) {
                    count++;
                }
            }
            if (result.contains("" + ch)) {
                continue;
            }
            //count variable determines duplication of a given letter
            if (count == 1 ){
                result += ch;
                result += "="+count+",";
            }
        }
        System.out.println(result);
    }


    }

