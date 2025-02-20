package Dec24;

public abstract class ApplePhone implements SmartPhone{

    abstract void iMessage();

    abstract void applePay();

    abstract void lostTracking();

    public void browser(){
        System.out.println("Safari");
    }

}
