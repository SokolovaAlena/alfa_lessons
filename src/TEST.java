import HomeWork3.Coworkers;
import HomeWork3.Worker;

import java.util.ArrayList;

public class TEST {
    public static void main(String[] args) {
        ArrayList <Coworkers> testArray = new ArrayList<>();
        System.out.println(testArray.size());
        Worker worker888 = new Worker("Ghhh",12);
        testArray.add(0, worker888);
        System.out.println(testArray.size());
    }
}
