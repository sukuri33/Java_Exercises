package Day21_assignments;

public class CompereLowerUpperCaseCount {


    public static void main(String[] args) {

        String str = "JAVA java";
        int upperCaseCount = 0;
        int lowerCaseCount = 0;
        for (int i = 0; i < str.length() ; i++) {
            if (Character.isUpperCase(str.charAt(i))){
                upperCaseCount++;
            }
            if (Character.isLowerCase(str.charAt(i))){
                lowerCaseCount++;
            }
        }
        System.out.println(upperCaseCount == lowerCaseCount);
    }



}


/*
6. Write program that returns true if the total number of upper case characters are equal to total number of Lowercase characters of a string
        Ex:
            str = "JAVA java";

        output:
            true

        Note: Use Wrapper class methods

 */