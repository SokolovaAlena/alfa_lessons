public class Arrays {
    public static void main(String [] args){
        int [] newArray =  {12,5,1,5,2,4,7,3};
        boolean sort =true;
        while (sort) {
            sort = false;
            for (int i = 0; i < (newArray.length - 1); i++) {
                if (newArray[i] > newArray[i + 1]) {
                    int x = newArray[i + 1];
                    newArray[i + 1] = newArray[i];
                    newArray[i] = x;
                    sort = true;
                }
            }
        }
        for (int i=0;i<newArray.length;i++){
            System.out.println(newArray[i]);
        }
    }

}
