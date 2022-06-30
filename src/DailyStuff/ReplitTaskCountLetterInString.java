package DailyStuff;

public class ReplitTaskCountLetterInString {

    public static void main(String[] args) {
        String str = "abbccc";

        String temp;
        int letterCount;
        String result = "";
        while (str.length() != 0){
            String letter = str.substring(0,1);
            temp = str.replaceAll(letter,"");
            letterCount = str.length() - temp.length();
            result += letterCount+letter;
            str = temp;
        }

        System.out.println(result);
    }

}
