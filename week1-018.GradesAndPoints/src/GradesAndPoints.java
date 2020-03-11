
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);


        System.out.println("Type the points [0-60]: ");
        int x = Integer.parseInt(reader.nextLine());

        System.out.print("Grade: ");

        if( x < 30){
            System.out.print("failed\n");
        } else if( x < 35){
            System.out.print("1\n");
        } else if( x < 40){
            System.out.print("2\n");
        } else if(x < 45){
            System.out.print("3\n");
        } else if(x < 50){
            System.out.print("4\n");
        } else {
            System.out.print("5\n");
        }


    }
}
