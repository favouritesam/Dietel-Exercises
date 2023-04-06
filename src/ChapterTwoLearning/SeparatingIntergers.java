package ChapterTwoLearning;

import java.util.Scanner;

public class SeparatingIntergers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any integer that consist of five digits");
        int number = input.nextInt();
         int n1 = number / 10000 % 10;
         int n2 = number / 1000 % 10;
         int n3 = number/ 100 % 10;
         int n4 = number / 10 % 10;
         int n5 = number % 10;



        System.out.println(n1 +" "+ n2+" "+n3+" "+n4+" "+n5);


    }
}
