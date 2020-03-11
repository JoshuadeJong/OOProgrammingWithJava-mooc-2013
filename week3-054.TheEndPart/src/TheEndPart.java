import java.util.Scanner;

public class TheEndPart {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("Type a word: ");
        String word = reader.nextLine();

        System.out.println("Length of end part: ");
        int len = Integer.parseInt(reader.nextLine());

        System.out.print("Result: ");
        for(int i = word.length() - len; i < word.length(); i++){
            System.out.print(word.charAt(i));
        }
        System.out.print("\n");

    }
}
