import java.util.Scanner;

public class  MonthOfTheYear {
    Scanner input = new Scanner(System.in);

    public void january() {
        System.out.println(" Capricornus");
    }

    public void february() {
        System.out.println("Pisces");
    }

    public void march() {
        System.out.println("Pisces");
    }

    public void april() {
        System.out.println("Gemini");
    }

    public void may() {
        System.out.println("Taurus");
    }

    public void june() {
        System.out.println("Cancer");
    }

    public void july() {
        System.out.println("July Cancer");
    }

    public void august() {
        System.out.println("Leo");
    }

    public void september() {
        System.out.println("libra");
    }

    public void october() {
        System.out.println("Scorpio");
    }

    public void november() {
        System.out.println(" Sagittarius");
    }

    public void december() {
        System.out.println(" Capricorns");
    }

    public void MonthsOfTheYear() {

        int given;
        do {
            System.out.println("Welcome to your zodiacs calender");
            int userInput = input.nextInt();
            switch (userInput) {
                case 1:
                    january();
                    break;
                case 2:
                    february();
                    break;
                case 3:
                    march();
                    break;
                case 4:
                    april();
                    break;
                case 5:
                    may();
                    break;
                case 6:
                    june();
                    break;
                case 7:
                    july();
                    break;
                case 8:
                    august();
                    break;
                case 9:
                    september();
                    break;
                case 10:
                    october();
                    break;
                case 11:
                    november();
                    break;
                case 12:
                    december();
                    break;
            }
            System.out.println("press 1 to continue,press 0 to exit");
            given = input.nextInt();
        }
        while (given ==1);
    }

}






