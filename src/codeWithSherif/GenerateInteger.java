package codeWithSherif;

import java.util.Scanner;

public class GenerateInteger {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter a number");
        int number = input.nextInt();

        switch (number){
            case 1 ->System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
        }


        if (number == 1){
            System.out.println("monday");
        }
        if (number == 2){
            System.out.println("tuesday");
        }
        if (number == 3){
            System.out.println("wednesday");
        }
        if (number == 4){
            System.out.println("thursday");
        }
        if (number == 5) {
            System.out.println("friday");
        }
        if (number == 6){
            System.out.println("saturday");
        }
        if (number == 7){
            System.out.println("sunday");
        }
    }
}
