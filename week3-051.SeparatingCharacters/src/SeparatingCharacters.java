
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type your name: ");
        String name = reader.nextLine();

        for(int i = 1; i <= name.length(); i++){
            System.out.printf("%d. character: %c\n", i, name.charAt(i-1));
        }

    }
}
