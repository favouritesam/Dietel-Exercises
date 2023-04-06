package chapterThree;

import java.util.Scanner;

public class HeartRates {
    Scanner input = new Scanner(System.in);
    private  String firstName;
    private String lastName;
//    private int dateOfBirth;
    private  String month;
    private int day;
    private int yearOfBirth;
    private int age;

    public HeartRates(String firstName, String lastName,String month,int day,int yearOfDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.month = month;
        this.day = day;
        this.yearOfBirth = yearOfDate;
        System.out.println("Enter your month");
        month = input.nextLine();
        System.out.println("Enter day of birth");
        day = input.nextInt();
        System.out.println("Enter birth year");
        yearOfDate = input.nextInt();

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYearOfDate() {
        return yearOfBirth;
    }

    public void setYearOfDate(int yearOfDate) {
        this.yearOfBirth = yearOfDate;
    }

    public int calculateAge(){

       this.age = 2023 - yearOfBirth;
       return age;
    }
    public int  calculateMaximumHeartRate(){

      int maximumHeartRate;
          maximumHeartRate = (220 - age);
        return maximumHeartRate;
    }
   public double calculateMinTargetHeartRate() {
       double minimumHeartRateRange = 50 / 100;
       double minimumTargetHeartRate;
       minimumTargetHeartRate = calculateMaximumHeartRate() - minimumHeartRateRange;
       return minimumTargetHeartRate;
   }
    public double calculateMaxTargetHeartRate() {
        double maximumHeartRateRange = 85 / 100;
        double maximumTargetHeartRate;
        maximumTargetHeartRate = calculateMaximumHeartRate() - maximumHeartRateRange;
        return maximumTargetHeartRate;
    }

    }

