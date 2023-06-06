//задача:
//создать массив и заполнить его рандомными числами (20 элементов)
//вывести его
//отсортировать пузырьком
//вывести отсортированный
//ввести число
//найти элемент методом деления пополам
//если не нашел, то вывести сообщение "сорян" но я не нашел ничего за столько операций

import java.util.Scanner;

public class sortArray {
    public static void main(String [] args){
        System.out.println("введите длину массива");
        Scanner s = new Scanner(System.in);
        int userArrayLenth=s.nextInt();
        System.out.println("Введите нижнюю границу диапазона");
        Scanner a = new Scanner(System.in);
        int min =a.nextInt();
        System.out.println("Введите верхнюю границу диапазона");
        Scanner b = new Scanner(System.in);
        int max = b.nextInt();
        System.out.println("Создаем массив из "+userArrayLenth+" элементов, в диапазоне от "+ min+" до "+max);
        int [] myArray = new int[userArrayLenth];
        for (int i=0;i<myArray.length;i++){
            myArray[i]= (int) (Math.random()*(max-min+1)+min);
            System.out.print(myArray[i]+", ");
        }
        System.out.println();
        System.out.println("Длина массива = "+myArray.length);
        System.out.println("Отсортированный массив");
        //Здесь нужно последовательно сравнивать значения соседних элементов и менять числа местами, если предыдущее оказывается больше последующего. Таким образом элементы с большими значениями оказываются в конце списка, а с меньшими остаются в начале.

        boolean sort =true;
        while (sort) {
            sort = false;
            for (int i = 0; i < (myArray.length - 1); i++) {
                if (myArray[i] > myArray[i + 1]) {
                    int x = myArray[i + 1];
                    myArray[i + 1] = myArray[i];
                    myArray[i] = x;
                    sort = true;
                }
            }
        }
        for (int i=0;i<myArray.length;i++){
            System.out.print(myArray[i]+", ");
        }
        //метод деления пополам
        System.out.println("Введите число для поиска");
        Scanner c =new  Scanner (System.in);
        int input = c.nextInt();

        int firstElement =0;
        int lastElement = myArray.length-1;
        int middle=0;
        int i=0;
        boolean f = false;
        while (firstElement<=lastElement){
            middle=(firstElement+lastElement)/2;
            if (input==myArray[middle]){
                f =true;
                i=i+1;
               break;
            } else {
                if (input<myArray[middle]){
                    lastElement=middle-1;
                    f=false;
                    i=i+1;
                } else{
                    firstElement=middle+1;
                    f=false;
                    i=i+1;
                }
            }
        }
        if(f){
            System.out.println("Искомое число в "+ middle + " элементе массива. Найдено за "+i+" итераций" );
        } else {
            System.out.println("я ничего не нашел:(");
        }

    }
}
