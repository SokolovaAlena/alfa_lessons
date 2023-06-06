//Найти слово, в котором число различных символов минимально.
// Слово может содержать буквы и цифры. Если таких слов несколько, найти первое из них.
// Например, в строке "fffff ab f 1234 jkjk" найденное слово должно быть "fffff".
//String[] array = text.split(" ");

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;


public class Task2 {
    public static final String MY_STRING="123b ggggggggggggg n4 avocado pineapple ";

    public static void main(String[] args) {
        Task2 app = new Task2();
        app.start();
    }

    private void start(){
        String [] myArray=MY_STRING.split(" ");
        System.out.println("В слове "+searchMinUniqueSymbols(myArray)+" меньше всего уникальных символов");
    }

    private String searchMinUniqueSymbols(String [] myArray){
        int x=1000000;  //буферная переменная
        String minWord="";
        for (String string: myArray){
            int y=getHashLength(string);
            if (y<x){
                x=y;
                minWord=string;
            }
        }
        return minWord;
    }


    public static int getHashLength(String word) {
        Set<Character> chars = new HashSet<>();
        for (int i = 0; i <word.length(); i++) {
            chars.add(word.charAt(i));
        }
        return chars.size();
    }
}

