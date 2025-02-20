package review;

import java.util.HashMap;

public class HashMap11 {
    public static void main(String[] args) {
        HashMap<String, String> result = new HashMap<>();
        result.put("A", "B");

        for(String a : result.keySet()){
            System.out.println(a);
            System.out.println(result.get(a));
        }

    }
}
