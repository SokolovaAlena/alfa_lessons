public class ClassesAndObjects {
    public static void main(String[] args){
        Person person1 = new Person();
        person1.name="Serj";
        person1.age=39;
        Person person2 =new Person();
        person2.name="Alena";
        person2.age=31;
        int year1=person1.calculateYearsToRetirement();
        int year2=person2.calculateYearsToRetirement();
        System.out.println(year1+" "+year2);
    }
}
class Person{
    //у класса могут быть:
    //1. Данные (поля) - возраст, вес
    //2. Действия, которые может совершать (методы) - ходить, смотреть
    //void - пустота
    String name;
    int age;
    int calculateYearsToRetirement(){
        int years =60-age;
        return years;
    }
    void speak(){
        for (int i=0;i<3;i++) {
            System.out.println("Меня зовут " + name + " " + age + " лет");
        }
    }
    void hello(){
        System.out.println("Привет");
    }
}

