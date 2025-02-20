package dec18;

public class Child extends Father{

    public static void main(String[] args) {
        Child child = new Child();
        System.out.println(child.watch);
    }

    String car2 = "Honda";
    public String watch2 = "Apple watch";
    int cash2 = 2343;

    //1.GrandFather  - 1
    //2.Father extends GrandFather - 1, 2
    //3.FathersBrother extends GrandFather - 1, 3
    //4.Child extends Father - 1, 2, 4

}
