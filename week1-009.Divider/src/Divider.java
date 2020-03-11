
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user.
        int a, b;
        float sum;

        System.out.println("Type a number: ");
        a = Integer.parseInt(reader.nextLine());

        System.out.println("Type another number: ");
        b = Integer.parseInt(reader.nextLine());

        sum = (float) a/b;

        System.out.println("Division: " + a + " / " + b + " = " + sum);

    }
}
