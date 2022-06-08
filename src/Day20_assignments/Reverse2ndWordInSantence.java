package Day20_assignments;

public class Reverse2ndWordInSantence {


    public static void main(String[] args) {
        String sentence = "I Love Java";
        String wordsArr[] = sentence.split(" ");
        String temp = "";
        for (int i = wordsArr[1].length()-1; i >= 0 ; i--) {
            temp += wordsArr[1].charAt(i);
        }
        System.out.println(sentence.replace(wordsArr[1],temp ));
    }
}

/*
1. Write a program that can reverse the second word of the sentence
            Ex:
                sentence = "I Love Java";

            output:
                I evoL Java
 */
