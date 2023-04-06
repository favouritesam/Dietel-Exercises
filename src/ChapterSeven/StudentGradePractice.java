package ChapterSeven;

import java.util.Arrays;

public class StudentGradePractice {
    public static void main(String[] args) {

        int[] grades  = new int[5];
        grades [0] = 2;
        grades [1] = 3;
        grades [2] = 4;
        grades [3] = 5;
        grades [4] = 6;

       Arrays.sort(grades);

        System.out.println("minimum is:" + grades [0]);
        System.out.println("maximum is:" + grades [4]);

        int total =0;
        for (int counter = 0; counter < grades.length  ; counter++) {
            total += grades[counter ];

        }
        int average;
        average = total / grades.length;
        System.out.println("average is:" + average);
    }
}