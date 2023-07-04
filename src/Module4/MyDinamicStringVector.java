package Module4;

public class MyDinamicStringVector {
    private String[] data = new String[3];
    private int size=0;

    private String getLast(){
        return data[data.length-1];
    }

    private String get(int i){
        return data[i];
    }

    private void add (String s){
        if (data.length<=size){
            String [] tempArray = data;
            data = new String[size*2];
            for (int i=0;i<tempArray.length;i++){
                data[i]=tempArray[i];
            }
            data[size]=s;
            size++;
        }

    }
    private int size(){
        return size;
    }

    public static void main(String[] args) {
        MyDinamicStringVector vector=new MyDinamicStringVector();
        vector.add("22");
        vector.add("128");
        vector.add("Expert");
        vector.add("что-то там еще");

        System.out.println(vector.get(0));
        System.out.println(vector.getLast());
        System.out.println(vector.size());
    }
}
