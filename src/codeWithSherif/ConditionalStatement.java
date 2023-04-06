package codeWithSherif;

import java.util.Scanner;

public class ConditionalStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = input.nextInt();
        if (number > 0){
            System.out.println("the number is positive");
        }
        if (number < 0){
            System.out.println("the number is negative");
        }
        }
    }
