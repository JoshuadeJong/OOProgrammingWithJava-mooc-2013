import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
    private int passLength;
    private Random random;

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.passLength = length;
        random = new Random();
    }

    public String createPassword() {
        // write code that returns a randomized password

        String password = "";

        for(int i = 0; i < this.passLength; i++){
            password = password + "abcdefghijklmnopqrstuvwxyz".charAt(this.random.nextInt(24));
        }

        return password;
    }
}
