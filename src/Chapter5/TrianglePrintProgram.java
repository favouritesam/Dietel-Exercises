package Chapter5;

public class TrianglePrintProgram {
    public static void main(String[] args) {

        for (int counter = 1; counter <= 7; counter++) {
            for (int colom = 1; colom <= counter; colom++) {
                System.out.print("*");

            }
            System.out.println();
        }
        int count = 6;
        for (int row = 0; row <= 7; row++) {
            for (int eby = 0; eby <= count; eby++) {
                System.out.print(" ");
            }
            for (int star = 0; star <=row ; star++) {
                System.out.print("*");

            }
            System.out.println();
            --count;
        }
        int jay = 6;
        for (int i = 0; i <= 7 ; i++) {
            for (int j = 0; j <= jay ; j++) {
                System.out.print(" ");


            }
            for (int sky = 0; sky <=i ; sky++) {
                System.out.println("*");

            }
            System.out.println();

        }
    }
}


