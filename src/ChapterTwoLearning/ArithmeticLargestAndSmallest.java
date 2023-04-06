package ChapterTwoLearning;

import java.util.Scanner;

public class ArithmeticLargestAndSmallest {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter first number");
//        int number = input.nextInt();
//
//        int count = 100;
//        int squareNum = number * number;
//        if (squareNum < count){
//            System.out.println("number is less than count");
//        }
//        if (squareNum > count){
//            System.out.println("number is greater than count");
//        }
//       if (squareNum != count){
//           System.out.println("number is not equals to count");
//       }
//       if (squareNum == count){
//           System.out.println("number is equals to count");
//       }

        Scanner input = new Scanner(System.in);
        System.out.println("enter first number");
        int num = input.nextInt();
        System.out.println("enter second number");
        int num2 = input.nextInt();
        System.out.println("enter third number");
        int num3 = input.nextInt();
        int sum = num + num2 + num3;
        int average = sum / 3;
        int product = num*num2*num3;

        int highestNumber = 0;
        int lowestNumber;
        if (num > highestNumber){
            highestNumber = num;
        }
        if (num2 > highestNumber){
            highestNumber = num2;
        }
        if (num3 > highestNumber){
            highestNumber = num3;
        }
        lowestNumber = num;
        if (num2 < lowestNumber){
            lowestNumber = num2;
        }
        if (num3 < lowestNumber){
            lowestNumber = num3;
        }
        System.out.printf("The sum is %d%n ", sum);
        System.out.printf("The average is %d%n ", average);
        System.out.printf("The product is %d%n ", product);
        System.out.printf("The smallest number is %d%n ", lowestNumber);
        System.out.printf("The highest number is %d%n ", highestNumber);
    }
}
