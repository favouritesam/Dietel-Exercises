package Chapter4;

import java.util.Scanner;

public class GasMileage {
//   private static int mile;
//   private static int gallon;
    int mile;
    int gallon;
  private static int trip;

   private static float grandTotal;
  static Scanner input = new Scanner(System.in);


    public static void main(String[] args) {
//
//        oilAndGas();
//        System.out.println("thank you!!");
//



        System.out.println("Enter -1 to use app, or any number to end ");
        int sentinel = input.nextInt();

        while (sentinel== -1){

        System.out.println("miles driven for each trip");
        int mile  = input.nextInt();
        System.out.println("gallons used for each trip");
        int gallon = input.nextInt();

        float total = (float) mile / (float)gallon;
         grandTotal = grandTotal + total;

        trip++;
            System.out.println("Grand total :"+ grandTotal);
            System.out.println("the trip is : "+ trip);

            System.out.println("\nEnter -1 to continue or any other number to end");
             sentinel = input.nextInt();

        }
        System.out.println("thank you!!");

}

//    private static void oilAndGas() {
//        System.out.println("Enter yes to use the app");
//        String sentinel = input.next();
//        if (!sentinel.equalsIgnoreCase("no") && !sentinel.equalsIgnoreCase("yes")){
//            oilAndGas();
//        }
//
//        while (sentinel.equalsIgnoreCase("yes")){
//            gas();
//
//            System.out.println("\nEnter yes to use the app" +
//                    "\nor enter no to end ");
//            sentinel = input.next();
//
//            if (sentinel.equalsIgnoreCase("no")){
//                 break;
//             }else if(sentinel.equalsIgnoreCase("yes")){
//                continue;
//            }
//            else
//                System.out.println("an invalid input");
//                oilAndGas();
//
//
//
//        }
//    }
//
//    private static void gas() {
//        System.out.println("miles driven for each trip");
//        int mile  = input.nextInt();
//        System.out.println("gallons used for each trip");
//        int gallon = input.nextInt();
//
//        float total = (float) mile / (float)gallon;
//        grandTotal = grandTotal + total;
//
//        trip++;
//        System.out.println("Grand total :"+ grandTotal);
//        System.out.println("the trip is : "+ trip);
//    }
}