package DailyStuff;

public class IfStringHasNumber {


    public static void main(String[] args) {

        String str = "I'm 25 years old";
        str = str.replaceAll(" ","");
        String result = "";
        char eachChar[] = str.toCharArray();

        for (int i = 0; i < eachChar.length; i++) {
            if (Character.isDigit(eachChar[i])){
                result += ""+eachChar[i];
            }
        }

        System.out.println(result);


    }

}
