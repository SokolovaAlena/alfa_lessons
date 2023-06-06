package HomeWork3;

public class Worker extends Coworkers implements Bonus {

    public Worker(String name, int age, int experience) {
        super(name, age, experience);
        this.position = "Worker";
        salary=500;
    }

    public Worker(String name, int age) {
        super(name, age);
        this.position = "Worker";
        this.salary=500;
        experience=1;

    }

    @Override
    public void setBonus() {
        if (experience<=12){
           bonusPercent=5;
        } else if (experience<=24) {
            bonusPercent=10;
        } else {
            bonusPercent=15;
        }
        salaryWithBonus = salary + salary * bonusPercent / 100;
    }


}
