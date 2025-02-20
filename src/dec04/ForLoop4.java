package dec04;

public class ForLoop4 {
    public static void main(String[] args) {

        //print all the odd numbers between 1 and 100

        for(int i = 1; i <= 100; i++ ){
            if(i%2==0){
                System.out.println(i);
            }
        }

        for(int a = 2; a <= 100; a+=2){
            System.out.println(a);
        }

        int b = 1;

        while(b <= 100){
            System.out.println(b);
            b+=2;
        }


        // print multiplication table of 7
        // 7, 14, 21, ... , 70


        //1*7=7
        //2*7=14
        //3*7=21
        //4*7=28

        //7
        //7+7=14
        //14+7=21
        //21+7=28

        for(int c= 1; c<=10; c++){
            System.out.println(c * 11);
        }

        for(int d=11; d<=110; d+=11){
            System.out.println(d);
        }
    }
}
