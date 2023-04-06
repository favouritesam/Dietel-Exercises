package ChapterTwoLearning;

import java.util.Scanner;

public class LargestAndSmallestIntegers {
    public static void main(String[] args) {
        int largestNumber;
        int smallestNumber;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first num1");
        int num1 = input.nextInt();
        System.out.println("enter second num2");
        int num2 = input.nextInt();
        System.out.println("enter third num3");
        int num3 = input.nextInt();
        System.out.println("enter fourth num4");
        int num4 = input.nextInt();
        System.out.println("enter fifth num5");
        int num5 = input.nextInt();

        largestNumber = num1;
        smallestNumber = num1;

        if (num2 > largestNumber) {
            largestNumber = num2;
        }
        if (num3 > largestNumber) {
          largestNumber=num3;
        }
        if (num4 > largestNumber) {
            largestNumber= num4;
        }
        if (num5 > largestNumber) {
            largestNumber = num5;
        }

        if (num2 < smallestNumber) {
            smallestNumber = num2;
        }
        if (num3 < smallestNumber){
            smallestNumber = num3;
        }
        if (num4 < smallestNumber){
            smallestNumber = num4;
        }
        if (num5 < smallestNumber){
            smallestNumber = num5;
        }
        System.out.println("the largest number is "+ largestNumber);
        System.out.println("the smallest number is "+ smallestNumber);

    }
}





