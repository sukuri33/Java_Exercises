package DailyStuff;

public class ReverseEachWordInAnArr {

    public static void main(String[] args) {

        String str = "i love java";
        String result = "";

        String arr[] = str.split(" ");

        for (int i = 0; i < arr.length; i++) {
            String temp = "";
            String each[] = arr[i].split("");

            for (int j = arr[i].length()-1; j >= 0 ; j--) {
                temp = temp + each [j];
            }
            result += temp+" ";
        }
        System.out.println(result);
    }

}
