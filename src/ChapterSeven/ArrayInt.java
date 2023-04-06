package ChapterSeven;

import java.util.Arrays;

public class ArrayInt {
    public static void main(String[] args) {
        int [] arr = new int[10];
       for (int i = 0; i < arr.length ; i++) {
          arr[i]= i+1;
          System.out.println(i);
       }
       for (int i = 0; i < arr.length ; i++) {
           System.out.println(arr[i]);

      }
         System.out.println(Arrays.toString(arr));

           for (int i = 0; i < arr.length; i++) {
               int [] arr1   = {1,2,3,4,5,6,7,8,9,10};
           System.out.println(arr[i]);
            //  change array index 0 to 100
            arr[0]=100;
//            Arrays
//    arr[0]=100;
             System.out.println(arr.equals(5));
       }

        }
}
