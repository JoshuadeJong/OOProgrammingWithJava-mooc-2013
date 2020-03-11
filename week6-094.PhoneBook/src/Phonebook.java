import java.util.ArrayList;

public class Phonebook {

    private ArrayList<Person> list = new ArrayList<Person>();

    public void add(String name, String phoneNumber){
        Person newPerson = new Person(name, phoneNumber);
        list.add(newPerson);
    }

    public void printAll(){

        for(Person contact: list){
            System.out.println(contact.toString());
        }

    }

    public String searchNumber(String name){

        for(Person contact: list){
            if(0 == name.compareTo(contact.getName())){
                return contact.getNumber();
            }
        }

        return "number not known";
    }

}
