package justlearn1;

import java.util.Scanner;

public class Lesson {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int passes = 0;
        int failures = 0;
        int studentCounter = 1;

        while(studentCounter<=10){
            System.out.println("Enter exam result (enter 1 for pass or 2 for failed) ");
            int examResult = input.nextInt();

            if(examResult==1){
                passes = passes + 1;
            }
            else {
                failures = failures + 1;

            }
            studentCounter = studentCounter + 1;

        }
        System.out.println("number of passes: " + passes);
        System.out.println("number of failures: " + failures);

        if(passes>=8){
            System.out.println("Bonus to instructor");
        }
    }
}
