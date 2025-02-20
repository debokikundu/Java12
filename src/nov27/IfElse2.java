package nov27;

public class IfElse2 {

    public static void main(String[] args) {
        //Income is less than $25,000 is considered low income
        //25,000 - 78,000 lower middle income
        //78,001 - 187,000  upper middle income
        // otherwise upper


        int income = 150000;

        if(income < 25000){
            System.out.println("low income");
        } else if(income < 78000) {
            System.out.println("lower middle income");
        } else if (income < 187000) {
            System.out.println("upper middle income");
        } else {
            System.out.println("upper income");
        }

    }
}
