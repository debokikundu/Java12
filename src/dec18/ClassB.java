package dec18;

public class ClassB {

    public static void main(String[] args) {
        ClassB ref = new ClassB();
        ref.m3();
        System.out.println(ref.b);
        ref.sum();
    }

    int a = 10;
    int b = 20;
    public String c = "Class";

    public void sum(){
        int d = 6;
        int e = 10;
        System.out.println( d + e );
    }

    private void m3(){
        System.out.println("method m3");
    }
}
