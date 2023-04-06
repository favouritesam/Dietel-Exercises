package ChapterTwoLearning;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a radius");
        double radius = input.nextDouble();

        double diameter = radius * 2;
        double circumference = radius * 2 * Math.PI;
        double area = radius * radius * Math.PI;

        System.out.printf("%n the diameter is %f" , diameter);
        System.out.printf("%n the circumference is %f" , circumference);
        System.out.printf("%n the area is %f" , area);



    }

}
