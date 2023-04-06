package NokiaPhone;

import java.util.Scanner;

public class Nokia {
    Scanner input = new Scanner(System.in);
    public void switchMenuUserInput() {
        int userInput = input.nextInt();
        switch (userInput) {
            case 1 -> phoneBook();
            case 2 -> message();
            case 3 -> chat();
            case 4 -> callRegister();
            case 5 -> tones();
            case 6 -> setting();
            case 7 -> CallDivert();
            case 8 -> Games();
            case 9 -> Calculator();
            case 10 -> Reminder();
            case 11 -> Clock();
            case 12 -> Profiles();
            case 13 -> SimService();
            default -> {
                System.out.println("Invalid input");
                loopMenuUserInput();
            }
        }
    }
    public void loopMenuUserInput(){
        String userInput = input.next();
        System.out.println("Do you want to continue? yes/no");
        do {
            if(userInput.equalsIgnoreCase("yes")){
                menu();
                System.out.println("Do you want to continue? yes/no");
            }else {
                System.out.println("Thank you for using Nokia 3310");
            }

        }while (userInput.equalsIgnoreCase("yes"));
    }


    public void menu() {
        System.out.println("Enter 1 for phone book\n" +
                "Enter 2 for Messages\n" +
                "Enter 3 for chat\n" +
                "Enter 4 for Call register\n" +
                "Enter 5  for Tones\n" +
                "Enter 6 for Setting \n" +
                "Enter 7 for Call divert\n" +
                "Enter 8 for Games\n" +
                "Enter 9 for Calculator\n" +
                "Enter 10 for Reminder\n" +
                "Enter 11 for Clock\n" +
                "Enter 12 for Profiles\n" +
                "Enter 13 for Sim service\n");
                    switchMenuUserInput();
                    loopMenuUserInput();

           }






    public void phoneBook() {
        System.out.println("1:Search\n" +
                "2:Service Nos.\n" +
                "3:Add name\n" +
                "4:Erase\n" +
                "5:Edit\n" +
                "6:Assign tone\n" +
                "7:Send b'card\n" +
                "8:option\n" +
                "9:Speed dials\n" +
                "10:Voice tags\n"+
                "11:press 0 to go back to menu");
        int userInput = input.nextInt();
        switch (userInput) {
            case 1:
                System.out.println("search");
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
                System.out.println("assign tone");
                break;
            case 7:
                System.out.println("send b'card");
                break;
            case 8:
                System.out.println("""
                        1. type of view
                        2. me
                        """);
                break;

                case 9:
                    System.out.println("speed dials");
                    break;
                case 10:
                    System.out.println("voice tags");
                    break;
            case 11:
                System.out.println("press 0 to go back to menu");
            }


        }


    public void message() {

        System.out.println("Enter 1 to Write messages\n" +
                "Enter 2 to Inbox\n" +
                "Enter 3 to Outbox\n" +
                "Enter 4 to pictures messages\n" +
                "Enter 5 to template\n " +
                "Enter 6 to smiley\n" +
                "Enter 7 to Message setting\n" +
                "Enter 8 to Info Service\n" +
                "Enter 9 to Voice mailBox Number\n" +
                "Enter 10 to Service command editor ");

        int userInput = input.nextInt();
        switch (userInput) {
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
                System.out.println("pictures messages");
                break;
            case 5:
                System.out.println("template");
                break;
            case 6:
                System.out.println("Smiley");
                break;
            case 7:
                System.out.println("""
                        Enter 1: Set 1
                        Enter 2: Common
                        """);

                int messageSettingChoice = input.nextInt();

                if(messageSettingChoice == 1) {
                    System.out.println("""
                            Enter 1: Message center number
                            Enter 2:Messages sent as
                            Enter 3: Message validity
               
                            """);

                } else {
                    System.out.println("""
                            Enter 1:Delivery reports
                            Enter 2:Reply via same center
                            Enter 3:Character support
                            """);
                }
            break;
            case 8:
                System.out.println("Info service");
                break;
            case 9:
                System.out.println("Voice mailBox Number");
                break;
            default:
                menu();
                break;

        }
    }

    public void chat() {
        int userInput = input.nextInt();
        switch (userInput) {
            case 1:
                System.out.println();
                break;

        }
    }

    public void callRegister() {
        System.out.println("""
                Enter 1:Missed calls
                Enter 2:Receive calls
                Enter 3:Dialled number
                Enter 4:Erase recent call
                Enter 5:Show call duration
                Enter 6:Show call costs
                Enter 7:Call cost setting
                Enter 8:Prepare credit
                """);
        int userInput = input.nextInt();
        switch (userInput) {
            case 1:
                System.out.println("Enter 1 for a missed call");
                break;
            case 2:
                System.out.println("Enter 2 to receive call");
                break;
            case 3:
                System.out.println("Enter 3 to dialled number");
                break;
            case 4:
                System.out.println("Enter 4 to Erase Recent call lists");
                break;
            case 5:
                System.out.println("""
                        Enter 1:Show calls duration
                        Enter 2:Show call cost
                        Enter 3:Call cost setting
                        Enter 4:Prepaid credit
                        """);
                int showCallDurationChoice = input.nextInt();

                if (showCallDurationChoice == 1) {
                    System.out.println("""
                            Enter 1:Last call duration
                            Enter 2:All calls' duration
                            Enter 3:Receive calls' duration
                            Enter 4:Dialled calls' duration
                            Enter 5:Clear timers
                            """);
                    break;
                }
                int showCallCostChoice = input.nextInt();
                if (showCallCostChoice == 2) {
                    System.out.println("""
                                      Enter 1:Last call cost
                                      Enter 2:All calls' cost
                                      Enter 3:Clear counters
                            }          """);
                    break;
                } else {
                    System.out.println("""
                            Enter 1:Call cost limit
                            Enter 2:Show cost in
                            """);
                    break;


                }
        }
    }

    public void preparedCredit() {
        int userInput = input.nextInt();
        switch (userInput) {
            case 1:
                System.out.println();
                break;

        }
    }

    public void tones() {
        System.out.println("""
                Enter 1:Ringing tone
                Enter 2:Ringing volume
                Enter 3:Incoming call alert
                Enter 4:Composer
                Enter 5:Message alert tone
                Enter 6:Keypad tones
                Enter 7:Warning and games tones
                Enter 8:Vibrating alert
                Enter 9:Screen saver
                """);
        int userInput = input.nextInt();
        switch (userInput) {
            case 1:
                System.out.println("Enter 1 for Ringing tone");
                break;
            case 2:
                System.out.println("Enter 2 for Ringing volume");
                break;
            case 3:
                System.out.println("Enter 3 for Incoming call alert");
                break;
            case 4:
                System.out.println("Enter 4 for Composer");
                break;
            case 5:
                System.out.println("Enter 5 for Message alert tone");
                break;
            case 6:
                System.out.println("Enter 6 for Keypad tones");
                break;
            case 7:
                System.out.println("Warning and games tones");
                break;
            case 8:
                System.out.println("Enter 8 for Vibrating alert");
                break;
            case 9:
                System.out.println("Enter 9 for Screen saver");
                break;


        }
    }

    public void setting() {
        System.out.println("""
                Enter 1 for Call settings
                Enter 2 for Phone setting
                Enter 3 for Security setting
                Enter 4 for Restore factory setting
                 """);
        int callSetting = input.nextInt();
        switch (callSetting) {
            case 1:
                callSettings();
                break;
            case 2:
                phoneSetting();
                break;
            case 3:
                securitySetting();
                break;
            case 4:
                restoredFactorySetting();
                break;


        }
    }

    public void callSettings() {
        System.out.println("""
                Enter 1 for Automatic redial
                Enter 2 for Speed dialling
                Enter 3 for Own number sending
                Enter 4 for Automatic answer
                """);
    }

    public void phoneSetting() {
        System.out.println("""
                Enter 1 for Language 
                Enter 2 for Call info display
                Enter 3 for Welcome note
                Enter 4 for Network selection
                Enter 5 for Light
                Enter 6 for Confirm sim service actions
                """);

    }

    public void securitySetting() {
        System.out.println("""
                Enter 1 for Pin code request
                Enter 2 for Call barring service
                Enter 3 for Fixed dialling
                Enter 4 for Close user group
                Enter 5 for Phone security
                Enter 6 for Change access codes
                """);
    }

    public void restoredFactorySetting() {
        int userInput = input.nextInt();
        switch (userInput) {
            case 1:
                System.out.println();
                break;

        }
    }
        public void  CallDivert() {
            int userInput = input.nextInt();
            switch (userInput) {
                case 1:
                    System.out.println();
                    break;

            }
            }
            public void Games(){
        int userInput = input.nextInt();
        switch (userInput){
            case 1:
                System.out.println();
                break;

        }
            }
           public  void  Calculator(){
        int userInput = input.nextInt();
        switch (userInput){
            case 1:
                System.out.println();
                break;

        }
           }
           public void  Reminder(){
        int userInput = input.nextInt();
        switch (userInput){
            case 1:
                System.out.println();
                break;
            default:
                menu();
                break;

        }
           }
           public void Clock(){
               System.out.println("""
                 Enter 1 for Alarm clock
                 Enter 2 for Clock
                 Enter 3 for Date setting
                 Enter 4 for StopWatch
                 Enter 5 for Countdown timer 
                 Enter 6 for Auto update of date and time  
                       """);
           }
        public  void Profiles(){
    int userInput = input.nextInt();
    switch (userInput){
        case 1:
            System.out.println();
        default:
            menu();
            break;

    }
        }
        public void SimService(){
        int userInput = input.nextInt();
        switch (userInput){
            case 1:
                System.out.println();
                break;
            default:
                menu();
                break;

        }
        }




    }
