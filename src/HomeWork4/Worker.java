package HomeWork4;

public class Worker extends Coworkers{

    double bonus;

    public Worker(String name, int age, int experience) throws MyExceptions,EmptyNameException {
        super(name, age, experience);
        position="Worker";
        salary=100;
        salaryWithBonus=salary;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void doWork(){
        System.out.println("I am Worker and I'm working");
        salaryWithBonus=Math.round((salary+bonus)*100.0)/100.0;
    }
}
