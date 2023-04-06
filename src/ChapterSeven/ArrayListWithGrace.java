package ChapterSeven;

import java.util.ArrayList;

public class ArrayListWithGrace {
    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<>();
        items.add("favour");
        items.add("dominic");
        items.add("inem");
        items.add("legend");
        items.add(2,"cephas");

        System.out.println(items);
        System.out.println("we have " + items.size() + "people in our list");
        System.out.println("let's remove some whimps!!!");

        items.remove("inem");
        System.out.println(items);
        System.out.println("we have" + items.size() + "people in our list");


        items.remove(2);
        System.out.println(items);
        System.out.println("we have " + items.size() + "people in our list");

//        items.removeAll(items);
//        items.clear();
        System.out.println("before cloning");
        System.out.println(items.clone());
        System.out.println("we have " + items.size() + "people in our list");

//        items.addAll()
//        items.forEach();
        System.out.println(items.contains("favour"));
        System.out.println(items.contains("inem"));
        System.out.println( items.lastIndexOf("legend"));
        items.add("legend");
        System.out.println(items);
        System.out.println(items.lastIndexOf("legend"));


    }
}
