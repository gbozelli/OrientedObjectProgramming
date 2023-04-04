package inheritance.Persons;

public class Student extends Persons{
    int credits;
    public Student(String name, String adress) {
        super(name, adress);
    }
    public void study(){
        this.credits += 1;
    }
    public String toString() {
        return super.toString() + "\n" + this.credits;
    }
}
