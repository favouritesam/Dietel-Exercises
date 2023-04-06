package femiWork;

import java.util.Arrays;

public class ReversedArrayNumber {
    public static void main(String[] args) {


        int [] numbers = {2,3,4,5};
        reversedArray(numbers);
        System.out.println(Arrays.toString(numbers));
    }
    public static int[] reversedArray (int [] numbers){
        int firstNumber = 0;
        int lastNumber = numbers.length -1;
        while (firstNumber < lastNumber){
            int num = numbers[firstNumber];
            numbers[firstNumber] = numbers [lastNumber];
            numbers[lastNumber] = num;
            firstNumber ++;
            lastNumber --;
        }

        return numbers;
    }
}
