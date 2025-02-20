package dec10;

public class IfElse4 {
    /*In a company everyone gets a $10000 salary.
    The company decided to give a bonus of 5% to employees
    if his/her year of service is more than 5 years, 10% for more than 10 years,
    30% for more than 15 years.*/

    public static void main(String[] args) {

        int years = 6;

        if(years>= 15){
            System.out.println(10000*1.30);
        } else if(years>=10){
            System.out.println(10000*1.10);
        } else if (years >= 5) {
            System.out.println(10000*1.05);
        } else {
            System.out.println(10000);
        }
    }
}
