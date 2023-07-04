import javax.crypto.spec.PSource;
import java.util.*;
import java.util.Arrays;

public class CollectionsExample {
    public static void main(String[] args) {

        //List - список элементов одинакового типа, могут дублироваться, сохраняет порядок добавления. Есть две реализации ArrayList и LinkedList.
            // ArrayList - дешевое обращение по индексу, дорогая вставка в середину массива
            //LinkedList - каждый элемент хранит ссылку на предыдущий и следующий элемент. Дешевая вставка в середину массива, дорогое обращение по индексу. Используют редко
        //Set - набор. Не допускает наличие дублей, не сохраняет порядок добавления. Имеется три варианта реализации:
            //HashSet - не сохраняет порядок добавления, добавление дублей игнорирует
            //linkedHashSet - сохраняет порядок добавления, добавление дублей игнорирует. Немного медленнее чем HashSet
            //TreeSet - содержит внутри себя дерево, и она позволяет легко сортировать элементы по значению. Н-р - строки сортируются по алфавиту
        //Map -отображение или "мапа". Коллекция, которая содержит ключ и значение. Коллекция работает подобно словарю. Map <String, Integer> (типизируем: первое- тип ключа, второе - тип значения). Дубликаты перетираются. Работает как стандартный метод пут
        // Существует три базовые реализации
        // HashMap
        //LinkedHash
        //
        List <String> fruits = new ArrayList<>();
        fruits.add("яблоко");
        fruits.add("вишня");
        fruits.add("арбуз");
        fruits.add("яблоко");
        System.out.println(fruits);

        List <String> fruits1 = new LinkedList<>();
        fruits1.add("яблоко");
        fruits1.add("вишня");
        fruits1.add("арбуз");
        fruits1.add("яблоко");
        System.out.println(fruits1);

        Set <String> fruits2 = new HashSet<>();
        fruits2.add("яблоко");
        fruits2.add("вишня");
        fruits2.add("арбуз");
        fruits2.add("яблоко");
        System.out.println(fruits2);


        Set <String> fruits3 = new LinkedHashSet<>();
        fruits3.add("яблоко");
        fruits3.add("вишня");
        fruits3.add("арбуз");
        fruits3.add("яблоко");
        System.out.println(fruits3);

        Set <String> fruits4 = new TreeSet<>();
        fruits4.add("яблоко");
        fruits4.add("вишня");
        fruits4.add("арбуз");
        fruits4.add("яблоко");
        System.out.println(fruits4);

        Map <String, Integer> fruits5 = new HashMap<>();
        fruits5.put("яблоко",6);
        fruits5.putIfAbsent("ананас",6);
        fruits5.put("вишня",5);
        fruits5.putIfAbsent("яблоко",4);
        System.out.println(fruits5);


        Map <String, Integer> fruits6 = new LinkedHashMap<>();
        fruits6.put("яблоко",6);
        fruits6.putIfAbsent("ананас",6);
        fruits6.put("вишня",5);
        fruits6.putIfAbsent("яблоко",4);
        System.out.println(fruits6);


        Map <String, Integer> fruits7 = new TreeMap<>();
        fruits7.put("яблоко",6);
        fruits7.putIfAbsent("ананас",6);
        fruits7.put("вишня",5);
        fruits7.putIfAbsent("яблоко",4);
        System.out.println(fruits7);
    }

}
