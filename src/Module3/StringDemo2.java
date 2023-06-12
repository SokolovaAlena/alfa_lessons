package Module3;

import java.sql.SQLOutput;

public class StringDemo2 {
    public static void main(String[] args) {
        String cat1 = "Cat";
        String cat2 = "Cat";
        String cat3 = new String("Cat");
        String cat4 = cat3.intern();

        System.out.println(cat1 == cat2);
        System.out.println(cat1 == cat3);

        System.out.println(cat1.equals(cat2));
        System.out.println(cat1.equals(cat3));
        System.out.println(cat1.equals(cat4));

        StringBuffer sb = new StringBuffer("Hi");

        for (int i = 0; i <= 100; i++) {
            sb.append(i);
        }
        System.out.println(sb);
    }
}
