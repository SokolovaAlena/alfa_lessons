import java.util.Random;
import java.util.Arrays;

public class ArraysOfInt {

        public static final int SIZE_OF_ARRAY = 20;
        public static final int MAXIMUM_POSITIVE = 10;

        public static void main(String[] args) {
            ArraysOfInt app = new ArraysOfInt();
            app.startApplication();
        }

        private void startApplication() {
            int[] testArray = myRandomArray();
            System.out.println(Arrays.toString(testArray));
            System.out.println("The position of the maximum negative element is: " + findMaxNegativePos(testArray));
            System.out.println("The position of the minimum positive element is: " + findFirstMinPositive(testArray));
            rearrangeElements(testArray, findMaxNegativePos(testArray), findFirstMinPositive(testArray));
            System.out.println(Arrays.toString(testArray));
        }

        private int[] myRandomArray() { // to create Array with Random Values
            Random generator = new Random();
            int[] myArray = new int[SIZE_OF_ARRAY];
            for (int i = 0; i < myArray.length; i++) {
                myArray[i] = generator.nextInt(SIZE_OF_ARRAY + 1) - MAXIMUM_POSITIVE;
            }
            return myArray;
        }

        private int findMaxNegativePos(int[] array) { // searching for the first max negative element in array
            int min = array[0];
            int index = 0;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < min) {
                    min = array[i];
                    index = i;
                }
            }
            return index;
        }

        private int findFirstMinPositive(int[] array) { // finding the minimum positive element in array
            int index = 0;
            int buffer = Integer.MAX_VALUE;//array[index];
            for (int i = 0; i < array.length; i++) {
                if (array[i] < buffer && array[i] > 0) {
                    buffer = array[i];
                    index = i;
                }
            }
            return index;
        }

        private int[] rearrangeElements(int[] array, int i, int j) { // swapping two elements in array
            int pocket = array[i];
            array[i] = array[j];
            array[j] = pocket;
            return array;
        }
}
