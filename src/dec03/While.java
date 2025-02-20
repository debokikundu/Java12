package dec03;

public class While {

    public static void main(String[] args) {

        int a  = 25;


        if(a > 20){
            System.out.println("a is larger than 20");
        }

        while(a > 20){
            System.out.println(a + " is larger than 20");
            a--;
        }

    }
}
