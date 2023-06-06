public class NameOfClassMustBeBig {
    public static void main(String[] args) {
        PersonNew person1 = new PersonNew();
        PersonNew person2 = new PersonNew("ananas");
        PersonNew person3 = new PersonNew(22);
        PersonNew person4 = new PersonNew("baby", 28);
        PersonNew person5 = new PersonNew("katya",18,"w");

    }
}

class PersonNew{

    private String name;
    private int age;
    private String gender;
    public PersonNew (String name, int age, String gender){
        this.name=name;
        this.age=age;
        this.gender=gender;
        System.out.println("привет из конструктора с тремя параметрами");
    }
    public PersonNew (){
        System.out.println("Привет из конструктора, который не принимает параметры");
    }
    public PersonNew (String name){
        this.name=name;
        System.out.println("Привет из конструктора, который принимает только имя "+name);
    }

    public PersonNew(int age) {
        this.age = age;
        System.out.println("Привет из конструктора, который принимает только возраст "+age);
    }

    public PersonNew(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Привет из конструктора, который принимает имя и возраст "+name+" "+age);
    }

    void setName(String name){
       this.name=name;
   }
}