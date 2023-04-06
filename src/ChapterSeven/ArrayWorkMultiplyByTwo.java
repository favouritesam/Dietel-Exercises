package ChapterSeven;

import java.util.Arrays;

public class ArrayWorkMultiplyByTwo {
    public static void main(String[] args) {
        int [] array = {2,4,3,1,8};
        System.out.println(Arrays.toString(multiplyByTwo(array)));

    }
    public static int [] multiplyByTwo(int [] numbers){
        for (int count = 0; count < numbers.length; count++) {
            int number = numbers [count] * 2;
            numbers [count] = number;


        }
        return numbers;
    }
}
