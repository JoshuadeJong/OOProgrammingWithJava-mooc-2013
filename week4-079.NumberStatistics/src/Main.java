import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        NumberStatistics total = new NumberStatistics();
        NumberStatistics even = new NumberStatistics();
        NumberStatistics odd = new NumberStatistics();

        System.out.println("Type numbers: ");

        while(true){
            int nextNum = Integer.parseInt(reader.nextLine());

            if( 0 > nextNum){
                break;
            } else {
                total.addNumber(nextNum);

                if(1 == nextNum%2){
                    odd.addNumber(nextNum);
                } else {
                    even.addNumber(nextNum);
                }

            }
        }

        System.out.println("sum: " + total.sum());
        System.out.println("sum of even: " + even.sum());
        System.out.println("sum of odd: " + odd.sum());


    }
}
