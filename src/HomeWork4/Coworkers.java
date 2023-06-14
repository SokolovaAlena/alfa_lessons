package HomeWork4;

public abstract class Coworkers {

    protected String name;
    protected int age;
    protected String position;
    protected boolean onWork;
    protected int experience;
    protected double salary;
    protected double salaryWithBonus;

    public Coworkers(String name, int age, int experience) throws MyExceptions, EmptyNameException {
        this.name = name;
        this.age = age;
        this.experience=experience;
        if (name==""){
                throw new EmptyNameException("name cannot be empty");
        }
        if (age<0){
            throw new NegativeValueException("age cannot be negative");
        } else if (age<18){
            throw new YoungAgeExceptions("the person is too young");
        } else if (age>=75){
            throw new OldAgeException("the person is too old");
        }
        if (experience<0){
            throw new NegativeValueException("experience cannot be negative");
        }
    }

    public void setAge(int age) throws MyExceptions {
        this.age = age;
        if (age<0){
            throw new NegativeValueException("age cannot be negative");
        } else if (age<18){
            throw new YoungAgeExceptions("the person is too young");
        } else if (age>=75){
            throw new OldAgeException("the person is too old");
        }
    }

    public void fire() {
        onWork = false;
        salary = 0;
        experience = 0;
        salaryWithBonus = 0;
    }

    public void doWork(){};

    public void getInfo() {
        System.out.println("Position is " + position
                + ". Name is " + name
                + ". Experience is " + experience
                + " month. My salary with bonus is " + salaryWithBonus
                );
    }
}
