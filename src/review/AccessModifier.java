package review;

import java.sql.SQLOutput;

public class AccessModifier {
    //public - class + package + other package
    //protected - class + package + other package(only child)
    //default - class + package
    //private - class

    public int a = 10;
    protected int b = 20;
    int c = 30;
    private int d = 40;
    static int e = 50;
   //non-static going to static method requires object creation


    public static void main(String[] args) {
//        AccessModifier am = new AccessModifier();
//        System.out.println(am.a + " " + am.b + " " + am.c + " " + am.d);

        System.out.println(e);
        sum();
    }

    static void sum(){
        System.out.println(5 +10);
    }
}
