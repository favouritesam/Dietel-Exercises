package ChapterSeven;

public class HighestNumberInArray {
    public static void main(String[] args) {
        int[] array = {1, 8, 3, 5, 2};
        System.out.println(functions(array));
    }

    public static int functions(int[] numbers) {
        int max = 0;
        for (int i : numbers) {
            if (i < max) {
                max = i;
            }

        }

        return max;
    }

}


