
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<Student>();


        String studentName;
        String studentID;

        while(true){

            System.out.println("name: ");
            studentName = reader.nextLine();

            if(0 == studentName.compareTo("")){
                break;
            } else {
                System.out.println("studentnumber: ");
                studentID = reader.nextLine();

                list.add(new Student(studentName, studentID));
            }
        }

        for(Student element: list){
            System.out.println(element.toString());
        }

        System.out.println("Give a search term: ");
        String searchTerm = reader.nextLine();

        System.out.println("Result: ");

        for(Student element: list){
            if( element.toString().contains(searchTerm)){
                System.out.println(element.toString());
            }
        }

    }
}
