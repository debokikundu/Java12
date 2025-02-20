package dec03;

public class ifElse4 {

    public static void main(String[] args) {

        //Sun - 1
        //Mon - 2
        //Tue - 3
        //Wed - 4
        //Thu - 5
        //Fri - 6
        //Sat - 7

        String day = "Aaa";

        if(day == "Sun"){
            System.out.println("Today we sell $1 products");
        } else if(day == "Mon"){
            System.out.println("Today we sell $2 products");
        } else if (day == "Tue") {
            System.out.println("Today we sell $3 products");
        } else if (day == "Wed") {
            System.out.println("Today we sell $4 products");
        } else if (day == "Thu") {
            System.out.println("Today we sell $5 products");
        } else if (day == "Fri") {
            System.out.println("Today we sell $6 products");
        } else if (day == "Sat") {
            System.out.println("Today we sell $7 products");
        } else {
            System.out.println("Wrong input");
        }


    }
}
