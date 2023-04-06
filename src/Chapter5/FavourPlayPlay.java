package Chapter5;

import java.util.Scanner;

public class FavourPlayPlay {

    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);

        String gender = "girl";
        String complexion = "Fair";

        System.out.println("Enter a first number");
        int firstNumber = value.nextInt();

        System.out.println("Enter the second number");
        int secondNum = value.nextInt();

        System.out.println("Enter the third number");
        int thirdNum = value.nextInt();

        if (firstNumber > thirdNum || firstNumber > secondNum){
            System.out.println(firstNumber+" is the largest");
        }
        else if (secondNum > thirdNum || secondNum > firstNumber)
        {
            System.out.println(secondNum+" is largest");
        }
        else if (thirdNum > firstNumber || thirdNum > secondNum) {
            System.out.println(thirdNum+" is largest");
        }
    }
}
