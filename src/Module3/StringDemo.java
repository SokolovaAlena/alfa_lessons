package Module3;

public class StringDemo {
    public static void main(String[] args) {
        String cat="Cat";
        String cat2 = new String("cat");
        String newString = String.valueOf(cat.charAt(0))+ String.valueOf(cat2.charAt(2));
        System.out.println(newString);

        if(newString.contains("Ct")){
            System.out.println("whf");
            System.out.println(cat.indexOf("t"));
        }
    }

}
