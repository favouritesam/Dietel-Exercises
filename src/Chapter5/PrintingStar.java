package Chapter5;

public class PrintingStar {
    public static void main(String[] args) {

   for (int row = 1; row <=7 ; row++) {
        for (int colom = 1;colom <= row; colom++) {
           System.out.print("*");

         }
        System.out.println();
       }
       for (int star = 1; star <=7 ; star++) {
          for (int dot = 7; dot >= star; dot--) {
            System.out.print("*");
          }
          System.out.println();
        }

//           System.out.println();

            for (int row = 1; row <=7 ; row++) {
                for (int colom = 1;colom <= row; colom++) {
                    System.out.print("*");
                    }
                for (int colom = 7; colom >=row ; colom--) {
                    System.out.print(".");

                }
                for (int colom = 7; colom >=row ; colom--) {
                    System.out.print("*");
                }
                for (int colom = 1;colom <= row; colom++) {
             System.out.print(".");
         }
                for (int colom = 1;colom <= row; colom++) {
                    System.out.print(".");
                }
                for (int colom = 7;colom >= row; colom--) {
                    System.out.print("*");
                }
                for (int colom = 7; colom >=row ; colom--) {
                        System.out.print(".");
                    }
                for (int colom = 1;colom <= row; colom++) {
                    System.out.print("*");
                }
                System.out.println();
                }

            }


        }







