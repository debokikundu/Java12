package Dec24;

public class Calculator {

    public static void main(String[] args) {
        Calculator cl = new Calculator();
        cl.sum( 5, 15);
        cl.sum(3.56, 8.56);
        cl.sum(34, 56.7);
        cl.sum(34.5 , 35);
        cl.sum(35, 78);
    }
    //overloading - same class, same method name, different parameter
    //overriding - parent / grandparent has same method name
    //polymorphism

    void sum(int c, int d){
        System.out.println(c + d);
    }

    void sum(double a, double b){
        System.out.println(a + b );
    }

    void sum(int e, double f){
        System.out.println(e + f);
    }

    void sum(double g, int h){
        System.out.println(g+h);
    }


}
