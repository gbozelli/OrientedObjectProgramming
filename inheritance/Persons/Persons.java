package inheritance.Persons;

public class Persons {
    private String name;
    private String adress;
    public Persons(String name, String adress){
        this.adress = adress;
        this.name = name;
    }
    public String toString() {
        return this.name + "\n" + this.adress;
    }
}
