package Chapter4;

import java.util.Scanner;

public class SentinelLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = input.nextInt();


        int sum = 0;
        while (sum != number){
            System.out.println("enter another integer");
            int number2 = input.nextInt();
            sum += number2;


        }
        System.out.println(sum);
    }
}
