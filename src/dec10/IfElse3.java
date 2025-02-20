package dec10;

public class IfElse3 {
    /*Write a program that takes a number as input from the user and
    checks if it's positive, negative, or zero. Print the corresponding message.*/

    public static void main(String[] args) {
        int number = 0;

        if(number > 0){
            System.out.println("positive");
        } else if(number < 0){
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }
    }
}
