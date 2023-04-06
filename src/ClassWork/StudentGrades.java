package ClassWork;

import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter first  grade and -1 to stop");
        int grade = input.nextInt();
        int counter = 0;
        int total = 0;
        while (grade != -1) {
            total += grade;
            counter++;
            System.out.println("enter next grade or enter -1 to stop");
            grade = input.nextInt();
        }
        if(counter != 0){
        int average = total / counter;
        System.out.println(average);
    }
        else{
            System.out.println("No grades were entered yet");
        }
    }

    }
