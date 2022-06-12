package Day21_assignments;

public class FindTheMaxAndMinNumber {


    public static void main(String[] args) {

        int[][] int2D = {{100,20,300},{10,1000,50},{-200,400,0}};

        int max = int2D[0][0];
        int min = int2D[0][0];

        for (int[] ints : int2D) {
            for (int i : ints) {
                if(i > max){
                    max = i;
                }
                if(i < min){
                    min = i;
                }
            }
        }

        System.out.println(max);
        System.out.println(min);
    }
}
