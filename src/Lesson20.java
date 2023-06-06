public class Lesson20 {
    public static void main(String[] args) {
        Human h1 = new Human(12,"Alena");
        int x=h1.hashCode();
        System.out.println(x);
    }
}

class Human{
    int age;
    String name;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }
}