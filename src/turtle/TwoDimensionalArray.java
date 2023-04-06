package turtle;

public class TwoDimensionalArray {

    public static void display(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }

    }
    public char [][] display1(char[][]array) {
       for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(array[i][j] == 'o'){
                    array[i][j] = 0;
                }
                else if(array[i][j]=='x'){
                    array[i][j] = 1;
                }
                System.out.println(array[i][j]);
            }
           System.out.println();
            }
    return array;
}}







