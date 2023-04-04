package inheritance;

import java.util.ArrayList;
import inheritance.Persons.*;

class program{
    public static void main(String[] args) {
        Student A = new Student("Jorge", "SP");
        System.out.println(A);
        Teacher B = new Teacher("Abdol", "RJ", 8);
        System.out.println(B);
        ArrayList<Persons> person = new ArrayList<Persons>();
        person.add(A);
        person.add(B);
    }
}
class functions{
    public static void printPersons(ArrayList<Persons> person){
        for(String i : person){
            System.out.println(i);
        }
    }
}