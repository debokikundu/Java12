package Dec24;

public class Aylin extends Thomas {

    public static void main(String[] args) {
        Aylin ref1 = new Aylin();
        ref1.selectCar();
    }

    String car = "Ford";
    int balance = 23453;

    void selectCar(){
        Aylin ay1 = new Aylin();
        System.out.println("Today I want to drive" + ay1.car);
        System.out.println("Today I want to drive" + super.car); //parent class variable
        System.out.println("Today I want to drive" + this.car); //own class variable
    }

    void job(){
        System.out.println("healthcare professional");
    }

}
