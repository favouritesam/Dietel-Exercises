package codeWithJonathan;

public class ReversedArrays {
    //    public static void main(String[] args) {
//
//        char[] names = {'s', 'e', 'm', 'i', 'c', 'o', 'i', 'o', 'h'};
//        for (int i = names.length; i >= 0; i--) {
//
//
//            }
//
//
//            }
//
//    public class Main {
    public static void main(String[] args) {
        char[] names = {'s', 'e', 'm', 'i', 'c', 'o', 'l', 'o', 'n'};
        reverseArray(names);
        System.out.println(names);
    }
        public static void reverseArray(char[] names) {
            int start = 0;
            int end = names.length - 1;
            while (start < end) {
                char num = names[start];
                names[start] = names[end];
                names[end] = num;
                start++;
                end--;
            }
        }
    }

