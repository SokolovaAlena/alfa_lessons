package myExeptions;

import java.io.File;
import java.util.Scanner;

public class Exceptions3 {
    //checked (compile time exceptions) = исключительные случаи работы программы. Они прописаны в спецификации
    //класс Exception. Они требуют их обработки еще до компиляции. Кроме RunTimeException
    //unchecked - runtime exceptions = ошибка в работе программы. Например ArrayIndexOutOfBoundsException -
    //вышли за пределы массива; NullPointerException - попытка произвести действия с null
    // ArithmeticException - например при попытке деления на 0; Эти исключения не нужно обрабатывать, а нужно исправлять код
    //программы, чтобы они не возникали. Это баги

    public static void main(String[] args) {
      int x = 1/0;
    }
}
