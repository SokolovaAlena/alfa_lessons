package Module4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraylistDemo {
    public static void main(String[] args) {
        String[] myArray = new String[3];
        myArray[0] = "Alexey";
        myArray[1] = "Alina";
        myArray[2] = "Andrey";
        List list = Arrays.asList(myArray);
        list = new ArrayList(list);

        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        for (Object i :
             list) {
            System.out.println(i.toString());
        }
        list.remove(3);
        list.forEach(i-> System.out.println(i));

    }


}
