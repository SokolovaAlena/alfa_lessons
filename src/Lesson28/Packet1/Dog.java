package Lesson28.Packet1;

public class Dog extends Animal{
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("Dog is eatting");
    }
    public void broke (){
        System.out.println("I am broke");
    }
}
