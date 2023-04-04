package inheritance.Examples;

public class Subclass extends Superclass{
    public Subclass(){
        super("Subclass");
    }
    public String toString(){
        return super.toString();
    }
}
