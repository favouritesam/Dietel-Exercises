package ChapterSeven;

import java.util.Scanner;

public class GradeOfStudentMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GradeOfStudent gradeOfStudent = new GradeOfStudent() ;
        System.out.println("how many subject do u want?");
        int numberOfSubject = input.nextInt();
        int[] studentGrade = new int[numberOfSubject];
        gradeOfStudent.setStudentGrade(studentGrade);
        gradeOfStudent.Average();
        System.out.printf("%s%d%n","The maximum grade is:",gradeOfStudent.getMaximum(studentGrade));
        System.out.printf("%s%d%n","The minimum grade is:",gradeOfStudent.getMinimum(studentGrade ) );
    }
}
