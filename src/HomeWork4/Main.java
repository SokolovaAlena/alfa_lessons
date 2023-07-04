package HomeWork4;

import HomeWork3.YoungAgeException;

public class Main {
    public static void main(String[] args) throws MyExceptions {
        //создать сотрудников
        Worker worker1 = null;
        try {
            worker1 = new Worker("111", 22, 5);
        } catch (MyExceptions e) {
            e.printStackTrace();
        } catch (EmptyNameException e) {
            e.printStackTrace();
        }

        Manager manager1 = null;
        try {
            manager1 = new Manager("111", 73, 10);
        } catch (MyExceptions | EmptyNameException e) {
            e.printStackTrace();
        }

        Accountant accountant1 = null;
        try {
            accountant1 = new Accountant("Alla", 55, 5);
        } catch (MyExceptions | EmptyNameException e) {
            e.printStackTrace();
        }


        worker1.getInfo();
        try {
            worker1.setBonus(15);
        } catch (NegativeValueException e) {
            e.printStackTrace();
        }
        worker1.doWork();
        worker1.getInfo();
        accountant1.getInfo();
        try {
            accountant1.setGradePremium(0);
        } catch (WrongGradeException e) {
            e.printStackTrace();
        }
        accountant1.doWork();
        accountant1.getInfo();
        manager1.getInfo();
        manager1.setValueOfSale(1000);
        manager1.setPercentOfSale(10);
        manager1.doWork();
        manager1.getInfo();
    }
}
