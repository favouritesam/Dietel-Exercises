package ChapterSeven;

import java.util.Scanner;

public class GradeOfStudent {
    Scanner input = new Scanner(System.in);
    private int[] studentGrade;
    int studentGradeCounter;
    int grade;

  public void setStudentGrade(int[] studentGrade){
      this.studentGrade = studentGrade;

      for (studentGradeCounter  = 0; studentGradeCounter  < studentGrade.length  ; studentGradeCounter ++) {
          System.out.printf("%s%d%n","enter grade for the subject",studentGradeCounter+1);
          grade = input.nextInt();
          if (grade >0 && grade <= 100){
              studentGrade[studentGradeCounter] = grade;

          }else {
              System.out.println("Enter a valid input ");
          }
      }
  }
  public void Average(){
      int average = 0;
      int totalOfGrades = 0;

      for (int grade:studentGrade ){
          totalOfGrades += grade;
          average = totalOfGrades / studentGrade.length;
      }
      System.out.println("the average of the score is:" + average);
  }
  public int getMaximum(int[] studentGrade){
   int maximum = this.studentGrade[0];
   for (int grade: this.studentGrade){
       if (grade > maximum)
           maximum = grade;
   }
      return maximum;
  }
  public int getMinimum(int[] studentGrade){
      int minimum = this.studentGrade[0];
      for (int grade: this.studentGrade) {
          if(grade < minimum )
              minimum = grade ;


      }
      return minimum ;
  }
}
