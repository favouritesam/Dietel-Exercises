package ChapterSeven;

import java.util.Arrays;

public class StudentGrade {
    public static void main(String[] args) {
        int [] grades = {10,12,14,22,19,26,30,28,31,27} ;


        Arrays.sort(grades) ;


        System.out.println("Minimum is: " + grades[0]);
        System.out.println("Maximum is: " + grades[9]);

        int total = 0;
        for (int counter = 0; counter < grades.length  ; counter++) {
            total += grades [counter ];
        }
        int average;
        average = total / grades.length ;

        System.out.println("average is: " + average);
    }

}
