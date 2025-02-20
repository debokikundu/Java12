package review;

public class Array1 {

    public static void main(String[] args) {
        int[] a = { 25, 22, 12, 35, 19, 7, 45, 2, 55, 1, 65, -23, 28, 16, 76};

        int highest = a[0];
        int lowest = a[0];

        for(int i = 1; i < a.length; i++){
            if(a[i] > highest){
                highest = a[i];
            }
            if(a[i] < lowest){
                lowest = a[i];
            }
        }

        System.out.println(lowest);
        System.out.println(highest);

    }
}
