package ChapterSeven;

import java.util.Arrays;

public class OneDimension {
    public static void main(String[] args) {
        System.out.println("Enter first number");

        duplicateTwo();
        duplicationTwo();
    }
    public static void duplicateTwo(){
        int [] numbers = new int[10];
        numbers [0] = -1;
        numbers [1] = -1;
        numbers [2] = -1;
        numbers [3] = -1;
        numbers [4] = -1;
        numbers [5] = -1;
        numbers [6] = -1;
        numbers [7] = -1;
        numbers [8] = -1;
        numbers [9] = -1;
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

    }
    public static void duplicationTwo(){
        int [] numbers1 = new int[10];
        numbers1 [0] = 10;
        numbers1 [1] = 20;
        numbers1 [2] = 30;
        numbers1 [3] = 40;
        numbers1 [4] = 50;
        numbers1 [5] = 60;
        numbers1 [6] = 70;
        numbers1 [7] = 80;
        numbers1 [8] = 90;
        numbers1 [9] = 100;

        System.out.println(Arrays.toString(numbers1));
    }
}
