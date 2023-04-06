package Chapter4;

import java.util.Scanner;

public class chapterFour {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("enter student Grades");
        int studentGrades = input.nextInt();
        if (studentGrades >= 60){
            System.out.println("passed");
        }
        else  {
            System.out.println("failed");
        }
        if(studentGrades >= 90){
            System.out.println("A");
        }
        else{
            if (studentGrades>=80){
                System.out.println("B");
            }
            else {
                if (studentGrades >= 70){
                    System.out.println("c");
                }
                else {
                    if (studentGrades>= 60){
                        System.out.println("D");

                    }
                    else {
                        System.out.println("f");
                    }
                }
            }
        }
    }


    }

