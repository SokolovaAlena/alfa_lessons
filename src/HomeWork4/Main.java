package HomeWork4;

import HomeWork3.YoungAgeException;

public class Main {
    public static void main(String[] args) {
        //создать сотрудников
        Worker worker1=null;
        try {
             worker1= new Worker("Vasya",25,5);
        } catch (MyExceptions e) {
            e.printStackTrace();
            System.out.println("-----------------------------------\n-----------------------------------");
        } catch (EmptyNameException e) {
            e.printStackTrace();
            System.out.println("-----------------------------------\n-----------------------------------");
        }

        Manager manager1 = null;
        try {
            manager1 = new Manager("", 73, 10);
        } catch (MyExceptions | EmptyNameException e) {
            e.printStackTrace();
            System.out.println("-----------------------------------\n-----------------------------------");
        }

        Accountant accountant1 = null;
        try {
           accountant1 = new Accountant("Alla", 78, 5);
        } catch (MyExceptions| EmptyNameException e) {
            e.printStackTrace();
            System.out.println("-----------------------------------\n-----------------------------------");
        }


        worker1.getInfo();
        worker1.setBonus(15.2);
        worker1.doWork();
        worker1.getInfo();
        accountant1.getInfo();
        accountant1.setGradePremium(1);
        accountant1.doWork();
        accountant1.getInfo();
        manager1.getInfo();
        manager1.setValueOfSale(1000);
        manager1.setPercentOfSale(10);
        manager1.doWork();
        manager1.getInfo();
    }
}
