package dec18;

public class ClassC {


    public static void main(String[] args) {

        ClassC ref = new ClassC();
        ref.sum();
        ref.updatedSum(55, 11);
        ref.updatedSum(44, 33);
        ref.updatedSum(6, 5);

        System.out.println( 7 + 9);
        System.out.println(9 + "Red");

    }

    void sum(){
        int a = 6;
        int b = 5;

        System.out.println(a + b);
    }

    public void updatedSum(int c, int d){
        System.out.println(c * d);
    }


}
