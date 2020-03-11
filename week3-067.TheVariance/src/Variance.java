import java.util.ArrayList;

public class Variance {

    public static int number(ArrayList<Integer> list){

        int num = 0;

        for(int element: list){
            num++;
        }

        return num;
    }

    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {

        int sum = 0;

        for(int element: list){
            sum += element;
        }

        return sum;
    }

    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {

        int sum = sum(list);
        int count = number(list);

        return (double) sum/count;
    }

    public static double variance(ArrayList<Integer> list) {

        int    number = number(list) - 1;
        double mu = average(list);

        double var = 0;

       for(int x: list){
           var = var + x*x - 2*mu*x + mu*mu;
       }

        return var/number;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}
