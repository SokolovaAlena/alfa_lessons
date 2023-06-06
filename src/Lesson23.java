public class Lesson23 {
    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder("Hello");
        System.out.println(sb.toString());
        sb.append(" my");
        System.out.println(sb);
        sb.append(" friend");
        System.out.println(sb.toString());
        String x="Hello";
        String name ="Fedor";
        int age = 10;
        //System.out.printf(x+ " my name is %s and my age is %d",name,age);
        System.out.printf("my int is %-10d, and it has length of 10 symbols\n",1);
        System.out.printf("my int is %10d, and it has length of 10 symbols\n",1111111111);
        System.out.printf("my int is %10d, and it has length of 10 symbols\n",311111112);

    }
}
