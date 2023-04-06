package ChapterTwoLearning;

import java.util.Scanner;

public class NagetivePositive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first numbers");
        int numbers = input.nextInt();
        System.out.println("Enter second number ");
        int secondNumbers = input.nextInt();
        System.out.println("Enter third number");
        int thirdNumber = input.nextInt();
        System.out.println("Enter fourth number");
        int fourthNumber = input.nextInt();
        System.out.println("Enter fifth number ");
        int fifthNumber = input.nextInt();


        int negativeNumber = 0;
        int positiveNumber = 0;
        int zeroNumbers = 0;


        if (numbers < 0){
            negativeNumber ++;
        }
        if (numbers > 0){
            positiveNumber ++;
        }
        if (numbers == 0){
            zeroNumbers ++;
        }
        if (secondNumbers < 0){
            negativeNumber ++;
        }
        if (secondNumbers > 0){
            positiveNumber ++;
        }
        if (secondNumbers == 0) {
            zeroNumbers++;
        }
        if (thirdNumber < 0){
            negativeNumber ++;
        }
        if (thirdNumber > 0){
            positiveNumber ++;
        }
        if (thirdNumber == 0){
            zeroNumbers ++;
        }
        if (fourthNumber < 0){
            negativeNumber ++;
        }
        if (fourthNumber > 0){
            positiveNumber ++;
        }
        if (fourthNumber == 0){
            zeroNumbers ++;
        }
        if (fifthNumber < 0){
            negativeNumber ++;
        }
        if (fifthNumber > 0) {
            positiveNumber++;
        }
        if (fifthNumber == 0){
            zeroNumbers ++;
        }

        System.out.println("Negative number is: "+negativeNumber +"\nPositive number is:  "+ positiveNumber +"\nZero number is:  "+ zeroNumbers);
    }

}