package HomeWork4;

public class MyExceptions extends Exception{
    public  MyExceptions(String description){
        super (description);
        System.out.println("Вводите корректные значения при заведении пользователей");
    }
}
