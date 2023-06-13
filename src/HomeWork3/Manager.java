package HomeWork3;

public class Manager extends Coworkers implements Bonus {
    public Manager(String name, int age, int experience) throws MyExceptions, YoungAgeException {
        super(name, age, experience);
        this.position = "Manager";
        this.salary = 1000;
        bonusPercent = 0;
    }

    public Manager(String name, int age) {
        super(name, age);
        this.position = "Manager";
        this.salary = 1000;
        experience = 1;
    }


    @Override
    public void setBonus() {
        if (experience <= 6) {
            bonusPercent = 7;
        } else if (experience <= 30) {
            bonusPercent = 12.5;
        } else {
            bonusPercent = 14;
        }
        salaryWithBonus = salary + salary * bonusPercent / 100;
    }
}
