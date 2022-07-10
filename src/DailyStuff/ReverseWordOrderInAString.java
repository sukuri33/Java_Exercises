package DailyStuff;

public class ReverseWordOrderInAString {
    public static void main(String[] args) {
        
        String str = "I love Java";
        String[] strArr = str.split(" ");
        String reversedStr = "";
        for (int i = strArr.length - 1, j = 0 ; i >= 0; i-- , j++) {

            reversedStr += strArr[i]+" ";
        }

        System.out.println(reversedStr.stripTrailing()); // gets rid off trailing space from
                                                            // string value.
        
    }
}
