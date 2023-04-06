package Chapter5;

import java.util.Scanner;

public class DivisibleBy3 {
    // public static void main(String[] args) {

    public void divisible() {
        Scanner input = new Scanner(System.in);
        int counter = 0;
        System.out.println("Enter how many number you want to sum");
        int count = input.nextInt();
        for (int i = 1; i <= count; i++) {
            System.out.println("enter any number of choice");
            int number = input.nextInt();
            if (number >= 1 && number <= 30) {
                int division = number % 3;
                if (division == 0) {
                    System.out.println("number is divisible by 3");
                    counter += number;
                } else {
                    System.out.println("number is not divisible by 3");
                }

            }
        }
        System.out.println(counter);

        String userInput;
        do {
            System.out.println("do you wish to continue? yes or no");
           userInput = input.next();
            if (userInput.equalsIgnoreCase("yes")) {
                divisible();
            } else {
                System.out.println("THANKS");
                System.exit(0);
            }

            }
            while (userInput.equalsIgnoreCase("yes"));

        }
    }
