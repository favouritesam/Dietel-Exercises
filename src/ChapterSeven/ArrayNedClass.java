package ChapterSeven;

import java.util.Scanner;

public class ArrayNedClass {
    int[] arr = new int[5];
    int sum;
    Scanner input = new Scanner(System.in);

    public void showCase() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter first number");
            arr[i] = input.nextInt();
        }
    }

    public int Average() {
        for (int i = 0; i < arr.length; i++){
            sum =+ arr[i];
        }
        return  sum/ arr.length ;
    }
    public void loops(){
        System.out.println("do you want to find average");
        String  answer = input.next();
        System.out.println("enter a number");

        while (answer.equalsIgnoreCase("yes") ){}
        showCase() ;
        System.out.println("the average is"+Average());
        System.out.println("do you want to find average");
        answer = input.next() ;

    }
    }

