package nov27;

import java.sql.SQLOutput;

public class CombineLogic {

    public static void main(String[] args) {


        int a  = 23;
        int b = 28;
        int c = 78;
        int d  = 10;

        System.out.println("d > a");
        System.out.println(  d > a);

        System.out.println("c > b");
        System.out.println(c > b);

        System.out.println(true);
        System.out.println(false);

       // Can you vote in USA President election? (AND)
       //1.  Citizen and 2. 18 years or older

        System.out.println("Citizen and 27 years old");
        System.out.println(true && true);

        System.out.println("PR and 43 years old");
        System.out.println(false && true);

        System.out.println("PR and 12 years old");
        System.out.println(false && false);

        //voting situation, all have to be true to be true &&(AND)
        // true && true -> true
        // true && false -> false
        // false && true -> false
        // false && false -> false

        // Covid Vaccination(OR)
        // - 1. essential workers and 2. senior citizen


        System.out.println("JH, Age = 66");
        System.out.println(true || true);
        System.out.println("USPS , Age = 36 ");
        System.out.println(true || false);
        System.out.println("Google(Remote) , age = 38");
        System.out.println(false || false);

        //vaccination case, one is true, true ||(OR)
        // true || true -> true
        // true || false -> true
        // false || true -> true
        // false || false -> false


        System.out.println(!true);
        System.out.println(!false);

        System.out.println(!(23 >28));


    }
}
