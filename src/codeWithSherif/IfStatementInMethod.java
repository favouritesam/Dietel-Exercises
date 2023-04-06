package codeWithSherif;

import java.util.EnumSet;
import java.util.Scanner;
import static codeWithSherif.DaysOfWeek.*;

public class IfStatementInMethod {
    static Scanner scanner = new Scanner(System.in);
    public static DaysOfWeek myMethod(){
        System.out.println("Enter the integer value of the day of the week: ");
        int userInput = scanner.nextInt();
        for (DaysOfWeek day : EnumSet.range(MONDAY, SUNDAY)) {
            if (userInput == day.ordinal() + 1)
                return day;
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(myMethod());
    }
}
