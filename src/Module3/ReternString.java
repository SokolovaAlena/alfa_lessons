package Module3;

public class ReternString {
    public static void main(String[] args) {
        String name = "I am a best student in EPAM";
        StringBuffer eman = new StringBuffer();

        for (int i = name.length()-1; i>=0; i--) {
            String x = String.valueOf(name.charAt(i));
            eman.append(x);
        }
        System.out.println(eman);
        System.out.println(new StringBuffer(eman).reverse().toString());
    }
}
