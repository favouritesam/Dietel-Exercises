package ChapterTwoLearning;

import java.util.*;

public class BodyMassIndexCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter weight in kilograms");
        int weightInKilograms = input.nextInt();
        System.out.println("Enter height in meter");
        int heightInMeter = input.nextInt();

//        int BMI = (weightInKilograms * 703) / (heightInMeter * heightInMeter);
////        System.out.println("your weight in kilograms is:"+ weightInKilograms +"\n"+ "your height in meter is:"+ heightInMeter + BMI);
//        System.out.println(BMI);
//
        int total = heightInMeter * heightInMeter;
        int bmi = weightInKilograms / total;
        System.out.println(bmi);

    }
}