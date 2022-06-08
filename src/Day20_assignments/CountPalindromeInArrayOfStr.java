package Day20_assignments;

public class CountPalindromeInArrayOfStr {

    public static void main(String[] args) {

        String[] findPalindromeElm = {"anna", "level", "Java","bob","tact"};
        int palindromeCounter = 0;
        for (String s : findPalindromeElm) {
            String temp = "";
            for (int i = s.length()-1; i >= 0 ; i--) {
                temp += s.charAt(i);
            }
            if (s.equals(temp)){
                palindromeCounter++;
            }
        }
        System.out.println(palindromeCounter);
    }
}


/*
4. write a program that can count how many palindromes in an array of string
        Ex:
            {"anna", "level", "Java"};

            output:
                2

 */