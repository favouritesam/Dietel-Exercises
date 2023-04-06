package ChapterTwoLearning;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first integer");
       int number1 = input.nextInt();
        System.out.println("Enter second integer");
        int number2 = input.nextInt();

        int squareNumber = number1 * number1;
        int squareNumber2 = number2 * number2;
        int sum = squareNumber + squareNumber2;
        int squareOfEach = number1 * number2;
        int difference = squareNumber - squareNumber2;

        System.out.println("the square of number is " +squareOfEach);
        System.out.println("the difference is " +difference);
        System.out.println("the sum is " +sum);
    }
}
