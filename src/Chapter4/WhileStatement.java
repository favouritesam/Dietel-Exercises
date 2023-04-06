package Chapter4;

//import java.util.InputMismatchException;
//import java.util.Scanner;

//public class WhileStatement {
   // public static void main(String[] args) {
    //    Scanner input = new Scanner(System.in);
//        int total = 0;
//        int gradeCounter = 1;
//        int grade = 0;
//        while (gradeCounter <= 10) {
//            System.out.println("Enter first grade");
//            grade = input.nextInt();
//            total = total + grade;
//            gradeCounter = gradeCounter + 1;
//        }
//            int classAverage = total / 10;
//            System.out.printf("%nTotal grade of all 10 student %d%n", total);
//            System.out.printf("Class Average is %d%n", classAverage);

//        int countingNum = 0;
//
//        while (countingNum <= 500){
//            System.out.println(countingNum+". I will always do my assignment");
//            countingNum++;
//            }
//
      //  int counter = 1 ;
            //    while (counter <= 10){
               //     System.out.println(counter+". I will always do my assignment ");
                 //   counter++;
         //   }
      //  System.out.println();

         //   int counters = 1;
      //  for (;counters <= 10;) {
         //   System.out.println(counters+" Favour is a stubborn girl");
         //   counters++;
       // }
//        while (true) {
//            try {
//                System.out.println("Enter an integer: ");
//                int integerEntered = input.nextInt();
//                break;
//            } catch (InputMismatchException e) {
//                System.out.println("Stupid user! I said integer");
//                input.nextLine();
//
//            }
//        }
//       while (true){
//           try{
//               System.out.println("Enter an integer:");
//               int integerEnter = input.nextInt();
//               break;
//           }catch (InputMismatchException eby){
//               System.out.println("Don't be foolish,I said integers ");
//               input.nextLine();
//
//           }

//import java.util.Scanner;

        public class WhileStatement {
            public static void main(String[] args) {
               // Scanner input = new Scanner(System.in);
                System.out.println("enter even number");
                for (int i = 2; i <= 20; i+=2) {
                    System.out.println(i);
                }
                for (int i = 1; i <= 100 ; i+=3) {
                    System.out.println(i);
                }
                for (int i = 1; i <=100 ; i++) {
                    if (i %2 == 0){
                        System.out.println(i+ " it is an even number");
                    }else {
                        System.out.println(i+ " it is an odd number");
                    }

                }

                }

        }




