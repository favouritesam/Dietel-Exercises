package Chapter4;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter binary a numbers");
        int binary = input.nextInt();
        System.out.println(binaryInteger(binary));

            
        }
        public static int binaryInteger(int binaryNumber){
        int rightPosition = 0;
        int leftPosition = 0;
        while (binaryNumber != 0){
            int digit = binaryNumber % 10 ;
            rightPosition += digit * Math.pow(2, leftPosition);
            binaryNumber /= 10;
            leftPosition ++;
        }

            return rightPosition;
        }
    }

