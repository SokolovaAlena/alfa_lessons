import java.util.Scanner;

public class SortArrayWithMethods {
    public static final int LENGTH =20;
    public static final int MAX_ELEMENT=100;
    public static final int MIN_ELEMENT=-100;

    public static void main(String[] args) {
        SortArrayWithMethods newArray = new SortArrayWithMethods();
        newArray.start();
    }

    public void start(){
        int [] myArray= createRandomArray();
        System.out.println("My random array is:");
        printArray(myArray);
        sortRandomArray(myArray);
        System.out.println("My sorted array is:");
        printArray(myArray);
        int input =enterUserInput();
        searchUserInput(myArray,input);
    }

    private int[] createRandomArray(){
        int [] randomArray = new int[LENGTH];
        for (int i = 0; i <randomArray.length; i++) {
            randomArray[i]= (int) (Math.random()*(MAX_ELEMENT-MIN_ELEMENT+1)+MIN_ELEMENT);
        }
        return randomArray;
    }

    private static void printArray(int [] myArray){
        for (int i = 0; i <myArray.length; i++) {
            System.out.print(myArray[i]+", ");
        }
        System.out.println();
    }



    private void sortRandomArray(int [] myArray){
        boolean sort =true;
        while (sort) {
            sort = false;
            for (int i = 0; i < (myArray.length - 1); i++) {
                if (myArray[i] > myArray[i + 1]) {
                    int x = myArray[i + 1];
                    myArray[i + 1] = myArray[i];
                    myArray[i] = x;
                    sort = true;
                }
            }
        }
    }
    private int enterUserInput (){
        System.out.println("Введите число для поиска");
        Scanner c =new  Scanner (System.in);
        int input = c.nextInt();
        return input;
    }

    private void searchUserInput(int [] myArray, int input){
        int firstElement =0;
        int lastElement = myArray.length-1;
        int middle=0;
        int i=0;
        boolean f = false;
        while (firstElement<=lastElement){
            middle=(firstElement+lastElement)/2;
            if (input==myArray[middle]){
                f =true;
                i=i+1;
                break;
            } else {
                if (input<myArray[middle]){
                    lastElement=middle-1;
                    f=false;
                    i=i+1;
                } else{
                    firstElement=middle+1;
                    f=false;
                    i=i+1;
                }
            }
        }
        if(f){
            System.out.println("Искомое число в "+ middle + " элементе массива. Найдено за "+i+" итераций" );
        } else {
            System.out.println("я ничего не нашел:(");
        }
    }

}
