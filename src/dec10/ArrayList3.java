package dec10;

import java.util.ArrayList;

public class ArrayList3 {

    public static void main(String[] args) {
        ArrayList<String> tools = new ArrayList<>();
        tools.add("Jira");
        tools.add("Selenium");
        tools.add("TestNG");
        tools.add("Maven");
        tools.add("Git");

        System.out.println(tools);

        for( String a: tools){
            System.out.println(a);
        }

        // list some of your favorite movie names in arraylist and print them
    }

}
