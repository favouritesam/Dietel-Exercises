package turtle;

import java.util.Arrays;

public class TwoDimensionalArrayMain {
    public static void main(String[] args) {
        char [][] figure = {{'o','x','o'},{'x','o','o'},{'x','o','x'}};
        System.out.println(Arrays.deepToString(figure));
     TwoDimensionalArray.display(figure);
    }
}
