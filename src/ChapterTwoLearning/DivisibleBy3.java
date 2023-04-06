package ChapterTwoLearning;

import java.util.Scanner;

public class DivisibleBy3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter an integer");
        int number = input.nextInt();

        if (number % 3 == 0){
            System.out.println("the number is divisible by 3");
        }else {
            System.out.println("the number is not divisible by 3 ");
        }
    }
}
