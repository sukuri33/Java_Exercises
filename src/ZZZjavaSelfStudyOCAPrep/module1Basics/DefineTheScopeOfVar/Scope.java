package ZZZjavaSelfStudyOCAPrep.module1Basics.DefineTheScopeOfVar;

public class Scope {

    private static int y = 99;     //scope starts from line 5 and ends at line 29 OR 30 before the '}' symbol

    public static void main(String[] args) {

        //i = 0; variable i isn't declared at this line hence it being used here is invalid and out of its scope
        //d = 1.0; same goes for variable d too
        int i = y; //-------------------------------> scope starts at line 11 and ends at line 27 before the '}' symbol
        double d;

        {
            float f;
            f = 1.99F;
            System.out.println(f);
            i = 1;
            d = 1.0;

        }
//        System.out.println(f);
        i = 2;
        d = 1.1;
        //f = 1.1F; f's scope is within above block hence it being used here is invalid.

    }


}
