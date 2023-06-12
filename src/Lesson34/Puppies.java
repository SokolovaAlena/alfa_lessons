package Lesson34;

public class Puppies {
    private int id;
    public Puppies(int id) {
        this.id=id;
    }
    public void eat (){
        System.out.println("Puppy is eating");
    }

    public String toString (){
        return String.valueOf(id) ;
    }
}
