import java.util.ArrayList;
import java.util.List;

public class MyGenerics {
    public static void main(String[] args) {
        //java 5
        Animal ourAnimal = new Animal();
        List animals = new ArrayList();
        animals.add("cat");
        animals.add("dog");
        animals.add("frog");
        animals.add(ourAnimal);

        String myAnimal = (String) animals.get(3);
        System.out.println(myAnimal);

        // generics




        List <String> animals2 = new ArrayList<String>();
        animals2.add("cat2");
        animals2.add("dog2");
        String myAnimal2 = animals2.get(0);


        /////java 7
        List <String> animals3 = new ArrayList<>();

    }
}

class Animal {

}
