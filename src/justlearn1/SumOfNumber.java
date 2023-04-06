package justlearn1;

import java.util.Random;
import java.util.Scanner;

public class SumOfNumber {
    // public static void main(String[] args) {

    //for (int i = 1; i <= 10; i++ ){//
    // System.out.println(i);

    // int i = 1;
    // while (i <= 10){
    //   System.out.println(i);
    //  i++;
    //  }
    // int i =0;
    // do {
    // System.out.println(i);
    // i++;
    // }while (i <= 10);

    // System.out.println(" Hello");
    //  System.out.println("favour Nwadike");

    // System.out.println("Hello \n Nwadike Favour");
    //int number = 74 + 36;
    // System.out.println(74 + 36);
    // System.out.println(50 / 3)

    //  int a = -5 + 8 * 6;
    //  int b = (55 + 9)% 9;
    //  int c = 20 + -3 * 5 / 8;
    //  int d = 5 + 15 / 3 * 2 - 8 % 3;
    //  System.out.print(a + "\n" + b + "\n" + c +"\n" + d + "\n");
    //   Scanner input = new Scanner(System.in);
    // int secondNumber = 5;
    //  int firstNumber = 25;
    // System.out.println(firstNumber+ "*" +secondNumber + "=" + firstNumber * secondNumber);

    // Scanner input = new Scanner(System.in);
    // int firstNumber = 125;
    //int secondNumber = 24;
    // System.out.println(firstNumber+"+"+secondNumber+"="+(firstNumber + secondNumber+"\n"));

//calculate the sum integers from 1 to 10
//    int x = 1;

    //   while (x <= 10){//while x is less than or equal to 10
    //  sum += x;//add x to sum
    //    ++x;//increment x

    //   System.out.printf("the sum is:%d%n,sum");

    //  }
    // for (int counter = 1; counter <= 10; counter++) {

    //
    // int counter = 1;
    // while (counter <= 10) {
    //  counter = 1;
    //    counter++;
    //  }


    //  }
    //    }

//summing integers with the statement.
    // public class SumOfNumber {
    // public static void main(String[] args) {
    // int total = 0;
    //total even integers from 2 through 20
    //  for (int number = 2;number <= 20;number++){
    //  total += number;
    //  System.out.printf("%d",number);//  }


    //compound interest calculations with for.

    //double principal = 1000.0;//initial amount before interest.
    // double rate = 0.05;//interest
    //display headers
    //  Scanner input = new Scanner(System.in);
    //  System.out.print("input a number");
    //  int number = input.nextInt();
    //  for (int i=0;i<=10;i++){
    // System.out.println(number + "*" + (i + 0) + "=" +(number * (i+0)));
    //    }
    //     ;
    // int counter =1;
    // while (counter <= 8 ){
    // counter =1;
    //  counter+
    //  public static void main(String[] args) {
    //  Scanner input = new Scanner(System.in);
    //   System.out.println("input first number");
    // int  a = input.nextInt();
    //  System.out.println("input second number");
    //  int b = input.nextInt();
    //   int c = (a/b);
    //  System.out.println();
    // System.out.println(+c);

    //  int a = -5+8*6;
    //   int b = (55+9)%9;
    //  int c = 20 + -3*5/8;
    //  int d = 5+15/3*2-8%3;
    // System.out.println(a);
    //   System.out.println(b);
    //  System.out.println(c);
    //   System.out.println(d);

    // System.out.println("input first number ");
    //  int a = input.nextInt();
    //  System.out.println("input second number");
    //   int b = input.nextInt();
    //  System.out.println(a+ "*" +b + "="+( a * b ));


    //  int firstNumber = 25;
    // int secondNumber = 5;
    // System.out.println(firstNumber+ "*" +secondNumber + "="+(firstNumber * secondNumber));
    // Scanner input = new Scanner(System.in);
    //  System.out.println("enter first number");
    //  int firstNumber = input.nextInt();
    // System.out.println("enter second number");
    // int secondNumber = input.nextInt();
    // int sum = firstNumber + secondNumber;
    //   int multiply = firstNumber * secondNumber;
    //  int minus = firstNumber - secondNumber;
    // int division = firstNumber / secondNumber;
    //  int modulus = firstNumber % secondNumber;
    //  System.out.printf("sum = %d\nmultiply = %d\nminus =%d\ndivision=%d\nmodulus=%d\n",sum,multiply,minus,division,modulu
    //
    //
    //
    //
    // public static void main(String[] args){
    //  Scanner input = new Scanner(System.in);
    //    //  System.out.println("input a number");
    //  int number1 = input.nextInt();
    //  for (int i =0;i<=10;i++){
    //   System.out.print
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter first number of choice 1 - 12");
        for (int i = 0; i < 12; i++) {

            i = scanner.nextInt();
            switch (i) {
                case 1:
                    System.out.println("a partridge in a pear tree");
                    System.out.println("***************************");
                    break;
                case 2:
                    System.out.println("two turtle doves\nand a partridge in a pear tree");
                    System.out.println("**************************");
                    break;
                case 3:
                    System.out.println("three french hen\ntwo turtle doves\nand a partridge in a pear tree");
                    System.out.println("**************************");
                    break;
                case 4:
                    System.out.println("four calling birds\nthree french hen\ntwo turtle doves\nand a partridge in a pear tree");
                    System.out.println("**************************");
                    break;
                case 5:
                    System.out.println("five golden rings\nfour calling birds\nthree french hen\ntwo turtle doves\nand a partridge in a pear tree");
                    System.out.println("**************************");
                    break;
                case 6:
                    System.out.println("six geese a laying\nfive golden rings\nfour calling birds\nthree french hens\ntwo turtle doves\nand a partridge in a pear tree ");
                    System.out.println("**************************");
                    break;
                case 7:
                    System.out.println("Seven Swans A-swimming\nsix geese a laying\nfive golden rings\nfour calling birds\nthree french hen\ntwo turtle doves\nand a partridge in a pear tree");
                    System.out.println("*************************");
                    break;
                case 8:
                    System.out.println("Eight Maids A-milking\nseven swans A-swimming\nsix geese a laying\nfive golden rings\nfour calling birds\nthree french hen\ntwo turtle doves\nand a partridge in a pear tree");
                    System.out.println("**************************");
                    break;
                case 9:
                    System.out.println("");
        }






}
}

}