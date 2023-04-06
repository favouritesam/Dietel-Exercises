package ChapterTwoLearning;

import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("first Number");
        int firstNumber = input.nextInt();
        System.out.println("second Number");
        int secondNumber = input.nextInt();

       if (firstNumber % secondNumber == 0){
           System.out.println("is multiple");
       }else
           System.out.println("is double");

    }
}