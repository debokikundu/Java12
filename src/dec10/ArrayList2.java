package dec10;

import java.util.ArrayList;

public class ArrayList2 {

    public static void main(String[] args) {
        int[] number = {};
        ArrayList<Integer>  numbers = new ArrayList<>();

        numbers.add(5);
        numbers.add(8);
        numbers.add(15);
        numbers.add(82);
        numbers.add(24);
        numbers.add(65);

        for(int a : numbers){
            System.out.println(a);
        }

        System.out.println(numbers);

        numbers.remove(2);

        System.out.println(numbers);

        numbers.add(35);

        numbers.add(1, 45);

        System.out.println(numbers);



    }
}
