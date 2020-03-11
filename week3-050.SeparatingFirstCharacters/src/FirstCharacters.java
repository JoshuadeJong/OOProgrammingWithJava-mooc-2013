import java.util.Scanner;

public class FirstCharacters {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type your name: ");
        String name = reader.nextLine();

        if( 3 <= name.length()){
            System.out.printf("1. character: %c\n 2. character: %c\n 3. character: %c\n", name.charAt(0), name.charAt(1), name.charAt(2));
        }


    }
}
