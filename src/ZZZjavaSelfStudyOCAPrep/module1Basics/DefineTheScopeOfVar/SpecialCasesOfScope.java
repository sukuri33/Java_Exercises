package ZZZjavaSelfStudyOCAPrep.module1Basics.DefineTheScopeOfVar;

public class SpecialCasesOfScope {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++)//{  I didn't provide curly braces but there is an invisible one
            System.out.println("i is"+ i); //} I didn't provide curly braces but there is an invisible one
        //    System.out.println("final i is" + i); because of above invisible curly braces
        //the 'i' being used in the print statement would complain as it has no visibility to the 'i' declared at line 6 above

            int j = 0;
            for (int i = 0; i < 10; i++) {// Here 'i' is re-declared and notice that compiler isn't complaining
                                         // that is because above 'i' scope was ended at line 7 before the invisible curly braces
                                        //  compiler treat this 'i' for this 2nd loop as a brand new 'i'
                System.out.println("i is"+ i);
                j += i;
            }
            //System.out.println("final i is" + i);//the 'i' being used in the print statement would complain as it has no visibility to the 'i' declared at line 12 above in the 2nd for loop
            System.out.println("final j is" + j);
        }

    public void doStuff(int i){ // this 'i' is totally independent of the 'i'(es) in the main method.
                                // it belongs to this doStuff method as it declared as part of the method declaration itself
        System.out.println("i is"+ i);
    }

}
