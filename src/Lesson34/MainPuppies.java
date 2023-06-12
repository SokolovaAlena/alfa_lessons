package Lesson34;

import java.util.ArrayList;
import java.util.List;

public class MainPuppies {
    public static void main(String[] args) {
        List <Puppies> puppy1 = new ArrayList<>();
        puppy1.add(new Puppies(1));
        puppy1.add(new Puppies(2));
        test(puppy1);

        List<Labrador> labr1 = new ArrayList<>();
        labr1.add(new Labrador(3));
        labr1.add(new Labrador(4));
        test(labr1);
    }
    private static void test(List<? extends Puppies> ccc){
        for (Puppies num:ccc
             ) {
            System.out.println(num);
        }
    }
}
