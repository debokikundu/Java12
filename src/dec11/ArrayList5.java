package dec11;

import java.util.ArrayList;

public class ArrayList5 {


    public static void main(String[] args) {
        ArrayList<Integer> age = new ArrayList<>();
        age.add(23);
        age.add(30);
        age.add(33);
        age.add(43);
        age.add(31);

        age.remove(3);

        System.out.println(age);

    }
}
