package dec10;

public class IfElse {
    public static void main(String[] args) {
        /*"Write a program that takes a character as input from the user and checks
        if it's a vowel (a, e, i, o, u)
        or a consonant. Print the appropriate message."
         */

        char a = 'e';

        if(a == 'a' || a == 'e' || a =='i' || a =='o' || a =='u' ) {
            System.out.println("vowel");
        } else {
            System.out.println("consonant");
        }

    }
}
