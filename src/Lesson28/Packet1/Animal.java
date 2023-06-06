package Lesson28.Packet1;

import java.util.ArrayList;

public class Animal {
    public static ArrayList<Animal> myFirstList = new ArrayList<>();

    String name;
    int age;


    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        myFirstList.add(this);
    }

    public String toString(){
        return "{name: "+name + "; age: " + age+"}";
    }

    public static void printArray(){
        for (Animal animal: myFirstList) {
            System.out.println(animal.toString());
        }
    }

    public static void main(String[] args) {
        Animal cat= new Animal("Muscat",9);
        Animal dog = new Animal("Fanta", 5);

        //System.out.println(myFirstList.get(0).toString());
        //System.out.println(myFirstList.get(1).toString());
        Animal.printArray();

    }



    public void eat(){
        System.out.println("Animal is eating");
    }

}
