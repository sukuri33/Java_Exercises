package Day19_assignments;

public class reverseClassmateName {
    public static void main(String[] args) {

        String[] strArr = {"Ahmet","Alena","Alexander","Baturay","Ermek","Esmira"};

        for (int i = 0; i < strArr.length; i++) {
            String strReversedName = "";
            for (int j = strArr[i].length(); j > 0; j--) {
                strReversedName += strArr[i].charAt(j-1);
            }
            System.out.println(strReversedName);
        }

    }
}

/*
2. create string array, and store the names of your  class mates (10)
            reverse each students names and print them in separate lines
            	ex:
            		arr = {java, python, c#}

        		output:
        			avaJ
        			nohtyp
        			#c
 */
