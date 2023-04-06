import java.util.Scanner;

public class SevenDays {

    Scanner input = new Scanner(System.in);
    public void sunday(){
        System.out.println("sundays are for service");
    }
    public void monday(){
        System.out.println("weekday 1");
    }
    public void tuesday(){
        System.out.println("weekday2");
    }
    public void SevenDays(){

       int response;

        do {
            System.out.println("What day of the week are we?");
            int userInput = input.nextInt();
            switch (userInput){
                case 1:sunday();
                    break;
                case 2:monday();
                    break;
                case 3:tuesday();
                    break;

            }
            System.out.println("Enter 1 to continue,press 0 to exit");
            response = input.nextInt();
        }
        while (response == 1);

    }

}
