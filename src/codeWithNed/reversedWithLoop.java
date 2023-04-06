package codeWithNed;

public class reversedWithLoop {
    public static void main(String[] args) {

        String numbers = "5 4 3 2 9";
        for (int i = numbers.length ()-1; i >=0 ; i--) {
            char value = numbers.charAt(i);
            System.out.print(value);

        }
    }
}
