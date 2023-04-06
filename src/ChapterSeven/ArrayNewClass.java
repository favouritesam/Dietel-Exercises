package ChapterSeven;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayNewClass {
    public static void main(String[] args) {

       ArrayList<String> items = new ArrayList<>();
       items.add("Inem");
       items.add("Kinzy");
       items.add("Favour");
       items.add("Zaza");


        for (String array : items){
           System.out.println(array);
        }
//       correction
//        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
//        System.out.println(numbers);
//
//        for (int i = 0; i < numbers.size(); i++) {
//            System.out.print(numbers.get(i));
//            System.out.println();
//
//        }

    }
    }
