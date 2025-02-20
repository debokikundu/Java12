package dec10;

import java.util.ArrayList;

public class Array5 {
    public static void main(String[] args) {
        //5 states you visited
        String[] visited = {"MA", "MD", "NJ", "PA", "NC"};

        //5 states we are planning to visit
        String[] planning = new String[5];
        planning[0] = "FL";
        planning[1] ="CA";
        planning[2] = "VA";
        planning[3] = "WC";
        planning[4] = "SC";

        //don't know the countries, don't know the number
        ArrayList<String> countries = new ArrayList<>();
        countries.add("Mexico");
        countries.add("Thailand");
        countries.add("Brazil");
        countries.add("Canada");
        countries.add("UK");
        countries.add("Australia");
        countries.add("Germany");

        for(int i = 0; i < visited.length; i++){
            System.out.println(visited[i]);
        }

        for(String j : planning){
            System.out.println(j);
        }

        for( String k : countries) {
            System.out.println(k);
        }

        for(int l = 0; l < countries.size(); l++){
            System.out.println(countries.get(l));
        }

    }
}
