package dec10;

public class IfElse6 {
    /*If your age is between 13 to 19 the message will be “You are a teen”
    else the message will be “You are not a teen”*/

    public static void main(String[] args) {
        int age = 20;

        if(age >= 13 && age <=19){
            System.out.println("teen");
        } else {
            System.out.println("not teen");
        }
    }
}
