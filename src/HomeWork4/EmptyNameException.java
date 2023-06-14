package HomeWork4;

public class EmptyNameException extends Exception{
    public EmptyNameException(String description) {
        super(description);
        System.out.println("You need to input name");
    }
}
