package dec17;

public class AddNumbers {
    public static void main(String[] args) {
        /*Add all the numbers and print sum of 342, -231, 432, 997, 765,  -715, 234, 265, 322*/

        int[] nums = {342, -231, 432, 997, 765,  -715, 234, 265, 322};

        int sum = 0; //+342 +(-231) + 432 + 997 ...

        for( int i : nums){
            sum = sum + i;

        }

        System.out.println(sum);

    }
}
