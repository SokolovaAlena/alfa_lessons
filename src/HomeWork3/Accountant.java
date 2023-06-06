package HomeWork3;

public class Accountant extends Coworkers implements Grade {
    public Accountant(String name, int age, int experience) {
        super(name, age, experience);
        salary = 10000;
        position = "Accountant";
    }

    public Accountant(String name, int age) {
        super(name, age);
        salary = 10000;
        position = "Accountant";
    }

    @Override
    public void upGrade(int grade) {
        this.grade = grade;
        if (grade == 1) {
            salary = 10000;
        } else if (grade == 2) {
            salary = 12000;
        } else if (grade == 3) {
            salary = 15000;
        } else {
            System.out.println("Такого grade не существует");
        }
        salaryWithBonus = salary + salary * bonusPercent / 100;
    }
}
