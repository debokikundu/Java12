package jan07;

import java.util.ArrayList;
import java.util.HashMap;

public class ArrayList21 {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Sabrina");
        names.add("Abid");
        names.add("Misbha");
        names.add("Shanto");

        System.out.println(names);

        ArrayList<Character> grades = new ArrayList<>();
        grades.add('A');
        grades.add('A');
        grades.add('B');
        grades.add('C');

        //shop
        // prod1, prod2, prod3
        // 12.34, 23.43, 43.32

        //prod1 - $43.32, prod2 - 23.43, prod3 - 12.34

        HashMap<String, Double> prodDetails = new HashMap<>();

        prodDetails.put("prod1", 43.32);
        prodDetails.put("prod2", 23.43);
        prodDetails.put("prod3", 12.34);


        System.out.println(prodDetails);

        for(String a : prodDetails.keySet()){
            System.out.println(a + "  " + prodDetails.get(a));
        }
    }
}
