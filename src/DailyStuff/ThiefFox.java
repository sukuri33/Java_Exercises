package DailyStuff;

import java.util.Arrays;

public class ThiefFox {
    public static void main(String[] args) {
        boolean fox1WearsCoat = true;
        boolean fox2WearsCoat = true;
        boolean fox3WearsCoat = true;
        boolean fox4WearsCoat = false;

        boolean fox1HasATorch = true;
        boolean fox2HasATorch = true;
        boolean fox3HasATorch = true;
        boolean fox4HasATorch = true;

        String fox1CoatColor = "BLACK";
        String fox2CoatColor = "BLACK";
        String fox3CoatColor = "BLACK";
        String fox4CoatColor = "GRAY";
        System.out.println(Arrays.toString(fox1CoatColor.split("")));
        int fox1BagCount = 0;
        int fox2BagCount = 2;
        int fox3BagCount = 3;
        int fox4BagCount = 3;

        Fox fox1 = new Fox();

        fox1.setInfo(true,true,"BLACK",0);
    }


}
