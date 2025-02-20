package nov27;

public class Voting {

    // 18 years or older can vote

    public static void main(String[] args) {
        int age = 12;

        if(age >= 18) {
            System.out.println("Congratulations, you can now vote");
        }
        else    {
            System.out.println("sorry, this time, you can't vote");
        }
    }
}
