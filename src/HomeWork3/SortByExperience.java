package HomeWork3;

import java.util.Comparator;

public class SortByExperience implements Comparator<Coworkers> {

    @Override
    public int compare(Coworkers o1, Coworkers o2) {
        if (o1.getExperience()<o2.getExperience()) {
            return -1;
        }
        if (o1.getExperience()==o2.getExperience()){
            return 0;
        }
        return 1;
    }
}
