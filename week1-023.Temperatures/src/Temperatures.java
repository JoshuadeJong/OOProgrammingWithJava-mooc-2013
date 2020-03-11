
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        // Write your code here. 

        /* Graph is used as follows:
        Graph.addNumber(7);
        double value = 13.5;
        Graph.addNumber(value);
        value = 3;
        Graph.addNumber(value);
        Remove or comment out these lines above before trying to run the tests.
        */

        boolean flag;

        System.out.println("Give a Double: ");
        String y = reader.nextLine();

        while( !(y.equals("\n"))){

            double x = Double.parseDouble(y);

            if(-30 <= x && 40 >= x) {
                Graph.addNumber(x);
            }

        y = reader.nextLine();

        }
    }
}
