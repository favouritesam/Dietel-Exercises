package ChibuzosWork;

public class Assigment1 {
    public static void main(String[] args) {

        int[] numbers = {2, 3, 4, 5, 6, 7};

        // No 1 enhance loops
        int max = numbers[0];
        for (int i : numbers) {
            if (i > max) {
                max = i;
            }

        }
        System.out.println(max);

//        no 2
        for (int counter = numbers.length - 1; counter >= 0; counter--) {
            System.out.print(numbers[counter]);
            System.out.println();
        }

//        question 3

        int numb = 8;
        for (int j : numbers) {
            if (numb == j) {
                System.out.println("false");
            } else {
                System.out.println("true");
                break;

            }
        }
// question 4
        for (int i = 0; i < numbers.length ; i++) {
            if(i %2 != 0) System.out.println(numbers[i]);
        }
//        question 5
        for (int i = 0; i < numbers.length; i++) {
            if(i %2 == 0) System.out.println(numbers[i]);

        }
//        question 6
        int total = 0;
        for (int sum:numbers){
            total += sum;

        }
        System.out.println(total);

        }
    }
