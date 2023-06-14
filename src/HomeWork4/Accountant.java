package HomeWork4;

public class Accountant extends Coworkers{

    int grade;
    double premium;
    public Accountant(String name, int age, int experiance) throws MyExceptions, EmptyNameException{
        super(name, age, experiance);
        salary=2000;
        salaryWithBonus=salary;
        position="Accountant";
    }

    public void setGradePremium (int grade){
        this.grade=grade;
        if (grade==1){
            premium=100;
        } else if (grade==2) {
            premium=500;
        } else if (grade==3) {
            premium=1000;
        }
    }

    @Override
    public void doWork() {
        System.out.println("I am Accountant and I'm working");
        salaryWithBonus=Math.round((salary+premium)*100.0)/100.0;
    }
}
