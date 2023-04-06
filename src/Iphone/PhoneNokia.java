package Iphone;

import java.util.Scanner;

public class PhoneNokia {
    public static void main(String[] args) {
        Scanner menu = new Scanner(System.in);
        System.out.printf("select any function from menu%n%n1.phonebook%n%n2.messages%n%n3.chat%n%n4.call register%n%n5.tone%n%n6.settings%n%n7.callDivert%n%n8.Games%n%n9.calculator%n%n10.reminders%n%n11.clock%n%n12.profiles%n%n13.simServices%n%n14.");
        System.out.println("Enter any number of your choice");
        int c20 = menu.nextInt();


        switch (c20) {
            case 1:
                System.out.printf("phonebook%n%n1.search%n%n2.service Nos%n%n3.add name%n%n4.Erase%n%n5.Edit%n%n6.Assign tone%n%n7.Send b'card%n%n8.Option%n%n9.Speeds dials%n%n10.Voice tags%n%n11.");
                System.out.printf("Enter any number of your choice");
                int number = menu.nextInt();

                switch (number) {
                    case 1:
                        System.out.printf("search");
                        break;
                    case 2:
                        System.out.printf("service Nos");
                        break;
                    case 3:
                        System.out.printf("add name");
                        break;
                    case 4:
                        System.out.printf("Erase");
                        break;
                    case 5 :
                        System.out.printf("Edit");
                        break;
                    case 6:
                        System.out.printf("Assign tone");
                        break;
                    case 7:
                        System.out.printf("Send b'card");
                        break;
                    case 8:
                        System.out.println("option");
                      //  System.out.println("1.Type of view%n 2.Memory status%n");
                        System.out.println("""
                                1:type of view
                                2:memory status
                                """);
                }
        }
    }
    }