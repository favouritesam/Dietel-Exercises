package ChapterSeven;

public class ArrayLowestTwo {
    public static void main(String[] args) {
        int [] num = {100,300,500,1000,5400};
        System.out.println(lowestNumber(num));
    }
    public static int lowestNumber(int [] numbers){
        int lowest = numbers [0];
        for (int i = 0; i <numbers.length ; i++) {
            if (numbers [i] < lowest){
                lowest = numbers [i];
            }

        }
        return lowest;
    }

}
