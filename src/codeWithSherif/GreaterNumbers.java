package codeWithSherif;

import java.util.Scanner;

public class  GreaterNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first Number");
        int firstNumber = input.nextInt();
        System.out.println("Enter second Number");
        int secondNumber = input.nextInt();
        System.out.println("Enter third Number");
        int thirdNumber = input.nextInt();

        if (firstNumber > secondNumber && firstNumber > thirdNumber){
            System.out.println(firstNumber);
        }
        if (secondNumber > firstNumber && secondNumber >thirdNumber){
            System.out.println(secondNumber);
        }
        if (thirdNumber > firstNumber && thirdNumber > secondNumber){
            System.out.println(thirdNumber);
        }
            }
        }


