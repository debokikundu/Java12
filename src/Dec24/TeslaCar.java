package Dec24;

public abstract class TeslaCar implements Car{

    abstract void selfDriving();

    abstract void camera360();


    void teslaFinance(){
        System.out.println("loan system");
    }

    //interface - only abstract method
    //class - only regular method
    // abstract class - both abstract and regular methos
}
