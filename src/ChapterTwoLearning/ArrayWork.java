package ChapterTwoLearning;

import java.util.Arrays;

public class ArrayWork {
    public static void main(String[] args) {
        int [] array = {2,4,3,1,8};
        System.out.println(Arrays.toString(addition(array)));

    }
    public static int [] addition (int [] number){
        int [] arr = new int[5];
        for (int i = 0; i < number.length ; i++) {
            int num = number[i] + number[i];
            arr [i] = num;


        }
        return arr;
    }
}
