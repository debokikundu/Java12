package dec18;

public class Function {
    public static void main(String[] args) {
        ClassB cb = new ClassB();
        System.out.println(cb.a);
        cb.sum();

        GrandFather gf = new GrandFather();
        gf.factory();



        Father father = new Father();
        System.out.println(father.cash1);


        Child child = new Child();



    }
}
