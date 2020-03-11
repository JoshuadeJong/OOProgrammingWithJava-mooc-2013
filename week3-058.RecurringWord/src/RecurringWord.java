
import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();

        boolean flag = true;

        while(flag){
            System.out.println("Type a word: ");
            String temp = reader.nextLine();

            for(String word : words){
                if(word.equals(temp)){
                    flag = false;
                    break;
                }
            }

            if(flag){
                words.add(temp);
            }
        }

        System.out.println("You typed the following words: ");

        for(String word : words){
            System.out.println(word);
        }
    }
}
