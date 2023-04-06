package ChapterSeven;

public class ArrayLowest {
    public static void main(String[] args) {
        int[] newArray = {24, 19, 30, 12, 50};
        System.out.println(lowestNumber(newArray));
    }


    public static int lowestNumber(int [] numbers){
        int lowest = numbers[2];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers [i]< lowest ){
               lowest = numbers[i];

            }

        }
        return lowest;

    }
}
