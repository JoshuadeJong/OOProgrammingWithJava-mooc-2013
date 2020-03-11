
import java.util.Scanner;

public class WordInsideWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type the first word: ");
        String word1 = reader.nextLine();
        System.out.println("Type the second word: ");
        String word2 = reader.nextLine();

        boolean  flag = false;

        for(int i = 0; (i <= word1.length() - word2.length()) && (!flag); i++){
            int j = 0;

            while(word1.charAt(i+j) == word2.charAt(j)){
                if(word2.length()  == j + 1){
                    flag = true;
                    break;
                } else {
                    j++;
                }
            }
        }

        if(flag){
            System.out.printf("The word '%s' is found in the word '%s'.\n", word2, word1);
        } else {
            System.out.printf("The word '%s' is not found in the word '%s'.\n", word2, word1);

        }


    }
}
