package justlearn1;

import java.util.Scanner;

public class RoughWorkTwo {
   static Scanner input = new Scanner(System.in);
    private int number ;

    public static void methodAdd(){
        System.out.println("enter first number");
        int firstNumber = input.nextInt();

        System.out.println("Enter second number");
        int secondNumber = input.nextInt();

        int total = firstNumber + secondNumber;
        System.out.println("total is " + firstNumber + " + " + secondNumber + "=" + total);



    }

    public static void main(String[] args) {
        System.out.println("Enter 1 to use this Application or press 2 to exit");
        int number = input.nextInt();
//        while (number == 1) {
            methodAdd();
//        }
    }
}
