import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ReadingFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        /*String separator = File.separator;
        String path =separator + "Users"+separator + "alenasokolova"+separator + "Desktop"+separator + "test.txt";
        File myFile = new File(path);*/
        File fileFromProject = new File("test2");

        Scanner scanner = new Scanner(fileFromProject);
       /*while (scanner.hasNextLine()){
           System.out.println(scanner.nextLine());
       }*/
        String line = scanner.nextLine();
        String [] numbersString =line.split(" ");
        int [] numbers = new int[3];
        int counter=0;

        for (String num:numbersString) {
            numbers[counter]=Integer.parseInt(num);
            counter++;

        }
        System.out.println(Arrays.toString(numbers));
       scanner.close();
    }
}
