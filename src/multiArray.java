public class multiArray {
    public static void main(String[] args){
        int [] [] myArray = {{1,2,3,11},{4,5,6,15},{7,8,9}};
        System.out.println(myArray.length);
        for (int i=0; i<myArray.length;i++){
            for (int x=0;x< myArray[i].length;x++){
                System.out.print(myArray[i][x]+", ");
            }
            System.out.println();
            System.out.println("длина"+myArray[i].length);
        }
    }
}
