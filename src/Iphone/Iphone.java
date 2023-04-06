package Iphone;

import java.util.Scanner;

public class Iphone {
    Scanner input = new Scanner(System.in);

    public void Menu() {
        System.out.println("""
                Welcome to Iphone Menu
                1:Phone book
                2:Messages
                3:Chat
                4:Call register
                5:Tones
                6:Settings
                7:Call divert
                8:Games
                9:Calculator
                10:Reminder
                11:Clock
                12:Profiles
                13:Sim service
                """);

        int smile = input.nextInt();
        switch (smile) {
            case 1:
                PhoneBook();
                break;
            case 2:
                Messages();
                break;
            case 3:
                Chat();
                break;
            case 4:
                CallRegister();
                break;
            //  case 5:
            //     Tones();
            //   break;
            //   case 6:
            //   Settings();
            //    break;
            // case 7:
            //   CallDivert();
            //   break;
            // case 8:
            //     Games();
            //     break;
            //   case 9:
            //   Calculator();
            //  break;
            //  case 10:
            //   Reminder();
            //    break;
            // case 11:
            //    Clock();
            //      break;
            //    case 12:
            //     Profiles();
            //     break;
            //    case 13:
            //      SimService();
            //     break;
        }
    }

    public void PhoneBook() {
        System.out.println("""
                1:Search
                2:Service Nos
                3:Add name
                4:Erase
                5:Edit
                6:Assign tone
                7:Send b'card
                8:Option
                9:Speed dials
                10:Voice tags
                """);


        for (int i = 0; i < 13; i++) {

            i = input.nextInt();
            switch (i) {

                //  int userInput = input.nextInt();
                // switch (userInput) {
                case 1:
                    System.out.println("Search");
                    break;
                case 2:
                    System.out.println("Service Nos");
                    break;
                case 3:
                    System.out.println("Add name");
                    break;
                case 4:
                    System.out.println("Erase");
                    break;
                case 5:
                    System.out.println("Edit");
                    break;
                case 6:
                    System.out.println("Assign tone");
                    break;
                case 7:
                    System.out.println("Send b'card");
                    break;
                case 8:
                    System.out.println("""
                            1:Type of view
                            2:Memory status
                                                        
                            """);
                    break;
                case 9:
                    System.out.println("Spend dials");
                    break;
                case 10:
                    System.out.println("Voice tags");
                    break;
                default:
                    Menu();

            }
        }
    }

    public void Messages() {
        System.out.println("""
                1:Write messages
                2:Inbox
                3:Outbox
                4:Picture messages
                5:Templates
                6:Smiley
                7:Message setting
                8:Info service
                9:Voice mailbox number
                10:Service command editor
                """);

        for (int i = 0; i < 13; i++) {

            i = input.nextInt();
            switch (i) {
                case 1:
                    System.out.println("Write messages");
                    break;
                case 2:
                    System.out.println("Inbox");
                    break;
                case 3:
                    System.out.println("Outbox");
                    break;
                case 4:
                    System.out.println("Picture messages");
                    break;
                case 5:
                    System.out.println("Templates");
                    break;
                case 6:
                    System.out.println("Smileys");
                    break;
                case 7:
                    System.out.println("""
                            1:Set 1
                            2:Common
                            """);

                    int MessageSetting = input.nextInt();
                    if (MessageSetting == 1) {
                        System.out.println("""
                                1:Message center number
                                2:Messages sent as
                                3:Message validity
                                    """);

                    } else {
                        System.out.println("""
                                1:Delivery report
                                2:Reply report
                                3:Character support
                                """);
                        break;
                    }
                case 8:
                    System.out.println("Info service");
                    break;
                case 9:
                    System.out.println("Voice mailbox number");
                    break;
                case 10:
                    System.out.println("Service command editor");
                    break;
                default:
                    Menu();
            }
        }
    }

    public void Chat() {
        System.out.println();
    }

    public void CallRegister() {
        System.out.println("""
                1:Call register
                2:Show call duration
                3:Show call costs
                4:Call cost setting
                5:Prepaid credit
                """);

        for (int i = 0; i < 13; i++) {
            switch (i) {
                case 1:
                    System.out.println("Call register");
                    break;
                case 2:
                    System.out.println("Show call duration");
                    break;
                case 3:
                    System.out.println("Show call costs");
                    break;
                case 4:
                    System.out.println("Call cost setting");
                    break;
                case 5:
                    System.out.println("Prepaid credit");
                    break;
            }
            int CallRegister = input.nextInt();
            if (CallRegister == 1) {
                System.out.println("""
                        1:Missed calls
                        2:Received calls
                        3:Dialled numbers
                        4:Erase recent call lists
                        """);
            }
                int ShowCallDuration = input.nextInt();
                if (ShowCallDuration == 2) {
                    System.out.println("""
                            1:Last call duration
                            2:All calls' duration
                            3:Received calls' duration
                            4:Clear timers
                            """);
                }
                    int ShowCallCosts = input.nextInt();
                    if (ShowCallCosts == 3) {
                        System.out.println("""
                                1:Last call
                                2:All calls' cost
                                3:Clear counters
                                """);
                    }
                        int CallCostSetting = input.nextInt();
                        if (CallCostSetting == 4) {
                            System.out.println("""
                                    1:Call cost limit
                                    2:Show costs in
                                    """);
                        } else {
                            System.out.println("Prepaid credit");
                            break;

                        }

                    }
                }


        }



