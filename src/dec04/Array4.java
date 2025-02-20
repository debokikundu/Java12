package dec04;

public class Array4 {
    //list flower names in an array and print

    public static void main(String[] args) {

        String[] flowers = {"Rose","Sunflower","lily"};

        String[] fruits = new String[5];

        fruits[0] = "apple";
        fruits[1] = "mango";
        fruits[2] = "banana";
        fruits[3] = "orange";
        fruits[4] = "grape";

        for(int i = 0; i< fruits.length; i++){
            System.out.println(fruits[i]);
        }

        for(String b : fruits){
            System.out.println(b);
        }

    }
}
