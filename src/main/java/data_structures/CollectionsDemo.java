package data_structures;

import java.util.*;

public class CollectionsDemo {

    public static void main(String[] args) {
        //setDemo();
        //ListDemo();
        //qeueDemo();
        // mapDemo();



    }
    public static void mapDemo() {
        Map fruitCalories = new HashMap();
        fruitCalories.put("apple", 150);
        fruitCalories.put("orange", 120);
        fruitCalories.put("banana", 150);
        System.out.println(fruitCalories);
    }
    public static void qeueDemo() {
        Queue fruits = new LinkedList();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("banana");
        fruits.add("pear");
        System.out.println(fruits);
        fruits.remove("apple");
        System.out.println(fruits);
    }
    public static void ListDemo() {
        List fruits = new ArrayList();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        System.out.println(fruits);

    }
    public static void setDemo() {
        Set fruits = new HashSet();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("lemon");

        var i = fruits.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

    }
}
