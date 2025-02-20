package dec17;

public class ClassA {

    public static void main(String[] args) {
        int c = 5;
        System.out.println(c);

        ClassA ref = new ClassA();
        System.out.println(ref.b);
        System.out.println(ref.a);
        ref.m1();
        ref.m2();
    }

     int a= 15;

      String b = "Selenium";

    void m1(){
        System.out.println("this is method 1");
    }

    void m2(){
        System.out.println("this is method 2");
    }

    //within own class sharing - private
    //within own class + own package - default
    //act as public or default - protected
    //within own class + own package + other package - public
}
