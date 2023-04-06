package codeWithSherif;

import java.util.EnumSet;
import java.util.Scanner;

import static codeWithSherif.Months.*;

public class Months365Days {
        
       Scanner input = new Scanner(System.in);
        public Months monthsMethod(){
            System.out.println("Enter the integer value of the months you want :");
            int userInput = input.nextInt();
            for (Months month :EnumSet.range(JANUARY , DECEMBER)) {
                if (userInput == month.ordinal() + 1)
                   return month;
                }
            return null;

            }


        }

    