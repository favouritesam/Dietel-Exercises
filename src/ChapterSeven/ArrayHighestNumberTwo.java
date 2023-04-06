package ChapterSeven;

public class ArrayHighestNumberTwo {
    public static void main(String[] args) {
        int [] arrays = {100,250,400,1000,300};
        System.out.println(highestNumber(arrays));
    }
    public static  int highestNumber(int [] numbers){
        int highest = numbers [0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers [i] > highest ){
                highest = numbers[i];
            }

        }
      return highest;
    }
}
