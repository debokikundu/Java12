package review;

public class Checking {
    public static void main(String[] args) {

        //public - class + package + other package - a
        //protected - class + package + other package(only child) - b
        //default - class + package - c
        //private - class - d

        AccessModifier am = new AccessModifier();

        System.out.println( am.a + " " + am.b + " " + am.c + " " + AccessModifier.e);
    }
}
