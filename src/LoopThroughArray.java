public class LoopThroughArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5 ,7,9};
        int count = 0;
//        for (int number : array) {
//            boolean countIsEven = count % 2 != 0;
//            if (countIsEven) System.out.println(number);
//            count ++;
//        }
             for (int counter = 1; counter < array.length ; counter+=2) {
           System.out.println(array [counter]);
       }

    }




}