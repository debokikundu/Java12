package Dec24;

public class SamsungPhone implements SmartPhone{


    @Override
    public void call() {
        System.out.println("call, contact, recent calls");
    }

    @Override
    public void text() {

    }

    @Override
    public void network() {

    }


    @Override
    public void browser() {

        System.out.println("internet or Google Chrome");
    }

    @Override
    public void camera() {
        System.out.println("triple camera, 50mp, 10x, .5");
    }

    @Override
    public void email() {
        System.out.println("gmail");
    }

    @Override
    public void videoCall() {
        System.out.println("google meet");
    }

    @Override
    public void gps() {
        System.out.println("google map");
    }

    @Override
    public void clock() {
        System.out.println("samsung clock");
    }

    void nfc(){
        System.out.println("google pay , samsung pay");
    }

    void note(){
        System.out.println("samsung note with spen");
    }

    void doubleScreen(){
        System.out.println("foldable phone");
    }
}
