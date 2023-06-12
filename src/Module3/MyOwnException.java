package Module3;

public class MyOwnException extends Exception {
    public void log(){
        System.out.println("this event was created at "+ System.currentTimeMillis());
    }
}
