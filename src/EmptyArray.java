import java.util.ArrayList;

public class EmptyArray {
    public static void main(String[] args) {
        int [] number = {12,3,6,20};
        ArrayList<Integer> reversedNum = new ArrayList<>();

        for (int i = number.length - 1; i >= 0 ; i--) {
            reversedNum.add(number[i]);
        }
        System.out.println(reversedNum);

        }
    }

