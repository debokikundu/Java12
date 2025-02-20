package dec17;

public class OddNumber {



    public static void main(String[] args) {
        /*Print odd numbers from 342, - 231, 432, 997, 765,
        - 715, 234, 265, 322*/

        int[] numbers = {342, -231, 432, 997, 765, -715, 234, 265, 322};

        for(int i : numbers) {
            if(i%2!=0) {
                System.out.println(i);
            }
        }
    }
    OddNumber(){

    }

    int[] numbers = {342, -231, 432, 997, 765, -715, 234, 265, 322};
}
