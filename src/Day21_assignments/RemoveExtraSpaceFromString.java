package Day21_assignments;

public class RemoveExtraSpaceFromString {


    public static void main(String[] args) {

        String str = "   Hello   world  I love     java     ";
        str = str.trim();
        String[] strArr = str.split(" ");
        String temp = "";
        for (String s : strArr) {

            if (!s.isEmpty()){
                temp += s+" ";
            }

        }

        System.out.println(temp.stripTrailing());

    }


}
