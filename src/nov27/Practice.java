package nov27;

public class Practice {

    public static void main(String[] args){
        int a = 5;
        String b  = "Java";
        char c = 'D';
        int d  = 10;
        int e  = 15;

        System.out.println(a + b + c);

        System.out.println( d + a);

        System.out.println( d - a);

        System.out.println( d * a);

        System.out.println( d / a);

        // 11/5 = 2.20
        // 10/5 = 2
        // 13/5 = 2.60

        System.out.println(13 / 5); //2 rather than 2.60
        System.out.println(17 / 5); // 3 not 3.40
        System.out.println(12 / 5); // 2, not 2.

        System.out.println(13 % 5); // 13/5 => 10/5 + 3/5 => 2 is result, 3 is remained

        System.out.println( 25 % 10); //5

        a++;
        a++;

        System.out.println(a);

        d--;
        d--;
        d--;
        d--;

        System.out.println(d);



    }
}
