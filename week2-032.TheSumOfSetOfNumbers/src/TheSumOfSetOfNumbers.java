
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Until what? ");
        int x = Integer.parseInt(reader.nextLine());

        System.out.println("Sum is" + ((x*x + x)/2));



    }
}
