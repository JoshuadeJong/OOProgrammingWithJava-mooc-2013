
import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here
        String names[] = new String [2];
        int ages[] = new int [2];

        for(int i = 0; i < 2; i++){
            System.out.println("Type your name: ");
            names[i] = reader.nextLine();

            System.out.println("Type your age: ");
            ages[i] = Integer.parseInt(reader.nextLine());
        }

        System.out.println(names[0] + " and " + names[1] + " are " + (ages[0] + ages[1]) + " years old in total.");


    }
}
