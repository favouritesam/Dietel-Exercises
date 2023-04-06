package Chapter5;

public class Star {
    public static void main(String[] args) {

        for (int row = 0; row <= 10; row++) {
            for (int colom = 0; colom <= row; colom++) {
                System.out.print("*");
            }
            for (int colom = 10; colom >= row; colom--) {
                System.out.print(" ");
            }
            for (int colom = 10; colom >= row; colom--) {
                System.out.print("*");
            }
            for (int colom = 0; colom <= row; colom++) {
                System.out.print(" ");
            }
            for (int colom = 0; colom <= row; colom++) {
                System.out.print("*");
            }
            for (int colom = 10; colom >= row; colom--) {
                System.out.print(" ");
            }
            for (int colom = 10; colom >= row; colom--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
