package jan07;

public class Print {

    public static void main(String[] args) throws Exception {
        System.out.println("Ananaya");
        Thread.sleep(3000);
        System.out.println("Farzana");
        Thread.sleep(5000);
        System.out.println("Deboki");

        Encapsulation1 ec1 = new Encapsulation1();
        ec1.setsSN("123456");
        System.out.println(ec1.getsSN());

        String sSNCustomer1 = ec1.getsSN();

        ec1.setsSN("234567");
        System.out.println(ec1.getsSN());
    }
}
