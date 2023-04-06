package femiWork;

import java.util.ArrayList;
import java.util.List;

public class FemiAssignment {
    public static void main(String[] args) {
        String[] resultArray = new String[]{"a", "b", "#", "#", "d", "#", "o"};
        ArrayList<String> tempArray = new ArrayList<>(List.of(resultArray));
        for (int i = 0; i < tempArray.size(); i++) {
            if (tempArray.get(i).equals("#")) {
                tempArray.remove(tempArray.get(i));
                tempArray.remove(tempArray.get(i - 1));
                i -= 2;
            }
        }
        System.out.println(tempArray);


    }
}
