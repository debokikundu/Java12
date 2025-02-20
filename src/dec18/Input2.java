package dec18;

import java.util.Scanner;

public class Input2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("input number1");
        int number1 = scan.nextInt();
        System.out.println("input number 2");
        int number2 = scan.nextInt();

        String c = scan.next();

        System.out.println(number1+number2);
    }
}
