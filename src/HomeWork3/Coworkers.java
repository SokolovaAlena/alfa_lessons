package HomeWork3;

import java.util.ArrayList;

public abstract class Coworkers implements Comparable<Coworkers> {
    protected String name;
    protected int age;
    protected String position;
    protected int experience;
    protected double salary;
    protected double bonusPercent;
    protected double salaryWithBonus;
    protected boolean onWork;
    protected int grade;

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public double getSalaryWithBonus() {
        return salaryWithBonus;
    }

    public String getName() {
        return name;
    }

    public Coworkers(String name, int age, int experience) throws MyExceptions {
        this.name = name;
        this.age = age;
        this.experience = experience;
        onWork = true;
        if (age > 75) {
            throw new OldAgeException("слишком старый");
        } else if (age < 18) {
            throw new YoungAgeException("вечно молодой");
        }
    }


    public void setAge(int age) {
        this.age = age;
    }

    public Coworkers(String name, int age) {
        this.name = name;
        this.age = age;
        experience = 0;
        onWork = true;
    }

    public void fire() {
        onWork = false;
        salary = 0;
        experience = 0;
        salaryWithBonus = 0;
    }

    public void getInfo() {
        System.out.println("Position is " + position
                + ". Name is " + name
                + ". Experience is " + experience
                + " month. My salary with bonus is " + salaryWithBonus
                + " My bonus is " + bonusPercent + " %");
    }

    public String toString() {
        return "\n{position: " + position + "; name: " + name
                + "; age: " + age
                + "; experience: " + experience
                + "; salaryWithBonus " + salaryWithBonus
                + " coworker works: " + onWork + "}";
    }

    @Override
    public int compareTo(Coworkers coworkers) {
        if (salaryWithBonus == coworkers.getSalaryWithBonus()) {
            return 0;
        } else if (salaryWithBonus < coworkers.getSalaryWithBonus()) {
            return 1;
        } else {
            return -1;
        }

    }

    public static void searchByName(ArrayList<Coworkers> list, String name) {
        ArrayList<Coworkers> tempArray = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName() == name) {
                tempArray.add(list.get(i));
            }
        }
        if (tempArray.size() == 0) {
            System.out.println("Сотрудник не найден");
        } else {
            System.out.printf("--------------------\nНайдено %d сотрудника\n", tempArray.size());
            System.out.printf("Результат поиска сотрудников с именем %s::", name + "\n" + tempArray);

        }
    }
}

