package codeWithSherif;

import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Are you a native of Semicolon ?");
        String respond = input.next();
        if(respond.equalsIgnoreCase("yes")){
        System.out.println("Are you in cohort 15 ?");
        String cohortRespond = input.next();
            if(cohortRespond.equalsIgnoreCase("yes")){
            System.out.println("you are entitled to take food and drink");}
            else {System.out.println("you are a thief");}
        }

//        if (Objects.equals(respond, "yes")){
//            if (Objects.equals(cohortRespond, "yes")){
//                System.out.println("you are entitled to take food and drink");
//
//            }else {
//                System.out.println("you are a thief");
//            }
//
//        }


        }
    }
