package myExeptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exceptions3 {
    public static void main(String[] args)  {
        //Checked exceptions (complite time exceptions) -- исключительные случаи работы программы. Программа не скомпилируется
        //Unchecked exceptions (Runtime exceptions) --  ошибка в работе программы например  int x= 1/0;

       // String name =null;
        //name.length();

        int [] arr = new int[4];
        System.out.println(arr[2]);


    }
}
