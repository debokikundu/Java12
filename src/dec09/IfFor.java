package dec09;

public class IfFor {

    // IF
    // condition it self
    //input


    //Bar
    // 21y / ID  - condition
    // input

    //Credit card
    // 3,000 - condition
    // int price = 1000;
    /*if(price <= 3000){
    System.out.println("you can buy");
     } else {
     System.out.println("you can't buy");
     }
     */

    //For
    // loan for 30 years, you pay monthly, $250
    // 360 times
    // $1 every month

    // 2 weeks contract,
    // 10 times

    // t-shirt , 250 t-shirts
    // do a design, print 1st tshirt , 2nd tshirt, 3rd tshirt, 250 times
    // starting , condition check, increment/decrement


    //01-99 but 13
    //start 1; check condition 99; increment 1 { if(number == 13) { don't print}}

    // 1- 100 but only even
    // 1 ; 100; 1+ { num%2==00 }

    //5, 10, 15, ... 50
    //10 times
    //starting 1; check 10; ++ { 1*5 }

    //50 times
    //condition (num%5==00) {print}

    //5; check 50, 5+

    //Array
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Pineapple", "Banana", "Orange", "Strawberry"};
        System.out.println(fruits[2] + ", " + fruits[3]);

        for(int i = 0; i <= fruits.length -1; i++){
            System.out.println(fruits[i]);
        }

        //alternative to regular for loop
        for(String b : fruits){
            System.out.println(b);
        }

        //alternative
        String[] flowers = new String[3];

        flowers[0] = "Rose";
        flowers[1] = "Jasmine";
        flowers[2] = "Lily";

    }



}
