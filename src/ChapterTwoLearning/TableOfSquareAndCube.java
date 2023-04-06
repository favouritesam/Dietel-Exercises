package ChapterTwoLearning;

public class TableOfSquareAndCube {
    public static void main(String[] args) {
        System.out.print("\tnumber \tsquare \tcube");
        for (int i = 0; i <= 10 ; i++) {

            int square = i * i;
            int cube = i * i * i;


           System.out.printf("%n\t\t%d \t\t%d \t\t%d",i,square,cube);

        }
    }
}
