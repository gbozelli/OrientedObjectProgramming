package inheritance.Persons;

public class Teacher extends Persons{
    private int salary;
    public Teacher(String name, String adress, int salary) {
        super(name, adress);
        this.salary = salary;
    }
    public String toString(){
        return super.toString() + "\n" + this.salary;
    }
}
