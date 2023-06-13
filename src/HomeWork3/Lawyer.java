package HomeWork3;

public class Lawyer extends Coworkers implements Grade {
    public Lawyer(String name, int age, int experience) throws MyExceptions {
        super(name, age, experience);
        salary = 20000;
        position = "Lawyer";
    }

    public Lawyer(String name, int age) {
        super(name, age);
        salary = 20000;
        position = "Lawyer";
    }

    @Override
    public void upGrade(int grade) {
        this.grade = grade;
        if (grade == 1) {
            salary = 20000;
        } else if (grade == 2) {
            salary = 30000;
        } else {
            System.out.println("Такого grade не существует");
        }
        salaryWithBonus = salary + salary * bonusPercent / 100;
    }
}
