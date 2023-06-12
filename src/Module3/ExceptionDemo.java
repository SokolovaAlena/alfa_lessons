package Module3;

public class ExceptionDemo {
    public static void main(String[] args) {
        makeArithmeticException();
        System.out.println("End of main");
    }
    private  static void makeArithmeticException(){
        try {
            int a = 5;
            int b = 0;
            System.out.println(a / b);
            throw new MyOwnException();
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (MyOwnException e) {
            e.log();
        } finally {
            System.out.println("Hello from finally");
        }
        throw new ArithmeticException("It was a zero");
    }
}
