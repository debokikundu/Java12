package review;

import java.util.ArrayList;

public class ArrayList1 {

    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Jamaica");
        cities.add("Ozone Park");
        cities.add("Fresh Meadows");
        cities.add("Flushing");

        System.out.println(cities);

        for(int i = 0; i < cities.size(); i++){
            System.out.println(cities.get(i));
        }

        for(String a : cities){
            System.out.println(a);
        }
    }
}
