import java.util.Scanner;

public class switch1 {
    public static void main(String [] args){
        System.out.println("введи возраст");
        Scanner s = new Scanner(System.in);
        int age = s.nextInt();
        switch (age){
            case 0:
                System.out.println("ты родился");
                break;
            case 32:
                System.out.println("you are star, superstar");
                break;
            default:
                System.out.println("хз что делать");
        }
    }
}
