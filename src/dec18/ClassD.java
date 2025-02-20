package dec18;

public class ClassD {

    public static void main(String[] args) {
        ClassD ref = new ClassD();
        ref.details("abc", "2000");
        ref.details("cde", "1990");
        ref.details("ert", "2222");

        System.out.println( 6 + 10);
        System.out.println("6" + "10");
        //T342342C
        //76762556
        //54326
        //76786
    }

    void details(String lastName, String year){
        System.out.println( "Last name is: " + lastName + " and birth year is: " + year);
    }
}
