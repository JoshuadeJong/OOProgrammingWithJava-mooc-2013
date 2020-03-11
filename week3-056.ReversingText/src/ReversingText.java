
import java.util.Scanner;

public class ReversingText {

    public static String reverse(String text) {

        char[] textChar = text.toCharArray();

        for(int i = 0; i < textChar.length/2; i++){
                char temp = textChar[i];
                textChar[i] = textChar[textChar.length - 1 - i];
                textChar[textChar.length - 1 - i] = temp;
        }

        return String.valueOf(textChar);
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}
