 package ClassWork;

import java.util.Scanner;

public class StudentGradeTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number or -1 to exist");
        int studentGrade = input.nextInt();
        int counter = 0;
        int total = 0;
        while (studentGrade != -1){
         total += studentGrade;
         counter++;
            System.out.println("Enter first number or -1 to exist");
            studentGrade = input.nextInt();
        }
        if(counter != 0){
          int average = total/counter;
            System.out.println("average");
        }
        else {
            System.out.println("enter no garde were enter" );
        }
    }
}


