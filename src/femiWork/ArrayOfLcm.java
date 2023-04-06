package femiWork;

import java.util.ArrayList;

public class ArrayOfLcm {
int [] numbers = {};

    public static void lcm(int numbers){
        ArrayList <Integer> arrayOfNumbers= new ArrayList<>();

        int count = 0;
        for (int i = 2; i < numbers; i++) {
            if (numbers != 0 && numbers % i == count){
                arrayOfNumbers.add(i);
                numbers = numbers / i ;
                count ++;
                while (numbers!= 0 && numbers % i ==0){
                    arrayOfNumbers.add(i);
                    numbers = numbers / i;
                }

            }

        }




        }

    }

