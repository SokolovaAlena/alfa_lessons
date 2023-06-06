package MyStructure;

abstract public class Coworkers {
    String name;
    int age;
    double salary;
    boolean highEducation;
    int experienceMonth;
    double bonus;
    String gender;

    public Coworkers(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender=gender;
    }

    abstract public void  startJob();
    abstract public void endJob();
    abstract public void work();

}
