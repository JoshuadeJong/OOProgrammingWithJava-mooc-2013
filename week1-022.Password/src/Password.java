
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.

        // Write your code here

        boolean flag = true;

        while(flag){

            System.out.println("Type the password: ");
            String userPass = reader.nextLine();

            if(password.equals(userPass)){
                flag = false;
                System.out.println("Right!");
                System.out.println();
                System.out.println("The secret is: Hello World.");
            } else {
                System.out.println("Wrong!");
            }


        }
    }
}
