package myExeptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exceptions1 {
    public static void main(String[] args)  {
        try {
            readFile();
        } catch (FileNotFoundException e) {
            System.out.println("словили исключение");
        }
    }

    public static void readFile() throws FileNotFoundException {
        File file = new File("test3");
        Scanner scanner = new Scanner(file);
    }
}
