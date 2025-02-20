package nov27;

import review.AccessModifier;

public class CheckPackage extends AccessModifier {

    //public - class + package + other package - a
    //protected - class + package + other package(only child object) - b
    //default - class + package - c
    //private - class - d

    public static void main(String[] args) {
        AccessModifier am = new AccessModifier();
        CheckPackage cp = new CheckPackage();

        System.out.println(am.a + " " + cp.b );
    }
}
