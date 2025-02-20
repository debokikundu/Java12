package dec17;

public class Supershop {

    public static void main(String[] args) {

        //Class ref = new Constructor();
        Fruit ref1 = new Fruit();
        Dresses ref2 = new Dresses();
        Accessories ref3 = new Accessories();

        System.out.println(ref1.c);
        System.out.println(ref1.b);
        System.out.println(ref2.c);
        System.out.println(ref3.j);

        ClassA a = new ClassA();

        a.m2();
        a.m1();
        System.out.println(a.b);
    }
}
