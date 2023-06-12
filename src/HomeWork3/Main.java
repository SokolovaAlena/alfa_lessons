package HomeWork3;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        //создать сотрудников
        Worker worker1 = new Worker("Bob", 25);
        Lawyer lawyer = new Lawyer("Boris", 41);
        Worker worker2 = new Worker("John", 33, 20);
        Manager manager1 = new Manager("Sam", 30, 23);
        Manager manager2 = new Manager("Tomas", 18);
        Manager manager3 = new Manager("Angela", 18, 22);
        Accountant accountant1 = new Accountant("Sam", 58);
        Accountant accountant2 = new Accountant("Elvira", 67);


        //начислить премию менеджерам и рабочим
        worker1.setBonus();
        worker2.setBonus();
        manager1.setBonus();
        manager2.setBonus();
        manager3.setBonus();
        //повысить грейд бухгалтерам и юристам
        accountant1.upGrade(2);
        accountant2.upGrade(1);
        lawyer.upGrade(1);
        //уволить одного менеджера
        manager3.fire();
        // накинуть опыта
        accountant1.setExperience(185);
        accountant2.setExperience(44);
        lawyer.setExperience(9);

        //создать список/коллекцию
        ArrayList<Coworkers> coworkersList = new ArrayList<>();
        coworkersList.add(worker1);
        coworkersList.add(worker2);
        coworkersList.add(manager1);
        coworkersList.add(manager2);
        coworkersList.add(manager3);
        coworkersList.add(accountant1);
        coworkersList.add(accountant2);
        coworkersList.add(lawyer);

        //распечатать список и отсортировать список по salaryWithBonus через интерфейс compareTo по убыванию
        System.out.println(coworkersList);
        Collections.sort(coworkersList);
        System.out.println("--------------------\n"+"Массив, отсортированный через интерфейс compareTo по убыванию salaryWithBonus\n"
                +coworkersList);

        //отсортировать список через Comparator по experience
        Collections.sort(coworkersList, new SortByExperience());
        System.out.println("--------------------\n"+"Массив, отсортированный через Comparator по возрастанию Experience \n"+coworkersList);

        //поиск по списку
        Coworkers.searchByName(coworkersList, "Sam");

    }

}
