package DailyStuff;


public class BlankClass {
    public static void main(String[] args) {


        int a = 10;
        int b = 0;

        int result = devide(a,b);
        System.out.println(result);

//        try {
//            int result = devide(a,b);
//            System.out.println(result);
//        }catch (ArithmeticException e){
//            e.printStackTrace();
//        }

        System.out.println("After try block");

    }

    private static int devide(int a,int b){
        return a/b;
    }
}
