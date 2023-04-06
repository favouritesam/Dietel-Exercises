package ChapterSeven;

public class ArrayPractiseTwo {
    public static void main(String[] args) {
        int[] TimeTable = new int[5];
        TimeTable[0] = 0;
        TimeTable[1] = 1;
        TimeTable[2] = 4;
        TimeTable[3] = 6;
        TimeTable[4] = 8;

        int sum = 0;
        for (int i = 0; i < TimeTable.length; i++) {
            sum += TimeTable[i];
        }
        System.out.println(sum);

    }
}
  //  int [] numbers ={10,5,20,50,100};
 //int total =0;
//for(int number : numbers{
//total+= number;
    //System.out.println(total)
