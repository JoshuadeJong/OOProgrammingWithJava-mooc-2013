
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("First: ");
        int first = Integer.parseInt(reader.nextLine())-1;
        System.out.println("Last: ");
        int last = Integer.parseInt(reader.nextLine());

        System.out.println("The sum is " + ( (last*last - first*first + last - first)/2 ));

        
    }
}
