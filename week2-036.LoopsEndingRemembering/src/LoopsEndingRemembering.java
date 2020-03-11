import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);

        int sum = 0;
        int num = 0;
        int ave;
        int even = 0;

        System.out.println("Type numbers: ");

        while(true){

            int x = Integer.parseInt(reader.nextLine());

            if( -1 == x ){
                break;
            } else {
                sum = sum + x;
                num++;

                if(0 == x%2){
                    even++;
                }
            }
        }

        System.out.println("Thank you and see you later!");
        System.out.println("The sum is " +sum );
        System.out.println("How many numbers: " + num);
        System.out.println("Average: " + ((double)sum/num));
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + (num - even));

    }
}
