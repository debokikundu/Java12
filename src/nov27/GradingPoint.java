package nov27;

public class GradingPoint {

    //0-39 - F
    //40-100 - A

    public static void main(String[] args) {
        int examPoint = 36;

        if(examPoint <= 39){
            System.out.println(" Grade F");
        } else {
            System.out.println(" Grade A");
        }
    }

}
