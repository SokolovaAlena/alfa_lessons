package HomeWorkCollections;

import java.util.*;

public class Main {
    //Метод, который наполняет ArrayList рандомными значениями

    public static void addRandomElements (ArrayList<Integer> myList, int count, int maxValue){
        Random random = new Random();
        int randomNumber;
        //не поняла как тут использовать цикл forEach, если изначально лист пустой
        for (int i=0; i<=count;i++){
            randomNumber=random.nextInt(maxValue);
            myList.add(randomNumber);
        }
    }

    //Метод, который проверяет отсортирован ли полученный массив
    public static void isSort(ArrayList<Integer> myList){
        ArrayList <Integer> tmpList = (ArrayList<Integer>) myList.clone(); //вот тут не понятно предупреждение
        Collections.sort(tmpList);
        System.out.println("Полученный массив"+myList);
        System.out.println("Отсортированный массив" + tmpList);
        if (tmpList.equals(myList)){
            System.out.println("Полученный массив отсортирован");
        } else {
            System.out.println("Полученный массив не отсортирован");

        }
    }
    public static void isUnique(ArrayList<Integer> myList){
        HashSet<Integer> tmpHash =new HashSet<>(myList);
        if (tmpHash.size()!=myList.size()){
            System.out.println("Есть дубликаты");
        } else {
            System.out.println("Все значения уникальны");
        }

    }

    public static void findPreMax (ArrayList<Integer> myList){
        ArrayList <Integer> tmpList = (ArrayList<Integer>) myList.clone();
        Integer max = Collections.max(tmpList);
        System.out.println("Максимальный элемент "+ max);
        tmpList.remove(max);
        max=Collections.max(tmpList);
        System.out.println("Элемент перед максимальным " + max);
    }
    public static void main(String[] args) {

        //создала ArrayList и заполнила его рандомными значениями
        ArrayList <Integer> myList = new ArrayList<Integer>();
        addRandomElements(myList,10,100);

        //проверяем, отсортирован ли массив
        isSort(myList);

        //сортируем ArrayList и проверяем отсортирован ли он повторно.
        Collections.sort(myList);
        isSort(myList);

        findPreMax(myList);

        //Создаем с дубликатами
//        ArrayList<Integer> dubAr = new ArrayList<Integer>();
//        dubAr.add(1);
//        dubAr.add(2);
//        dubAr.add(3);
//        dubAr.add(1);

//        isUnique(dubAr);



    }
}
