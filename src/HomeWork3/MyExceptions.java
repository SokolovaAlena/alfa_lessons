package HomeWork3;

public class MyExceptions extends Exception{
    public  MyExceptions (String description){
        super(description);
        System.out.println("Введите корректное значение поля");
    }
}
