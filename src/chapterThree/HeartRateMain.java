package chapterThree;

public class HeartRateMain {
    public static void main(String[] args) {
        HeartRates heartRates = new HeartRates("favour","nwadike","august",4,2000);
        System.out.println();
        System.out.println(heartRates.getFirstName());
        System.out.println(heartRates.getLastName());
        System.out.println(heartRates.getDay());
        System.out.println(heartRates.getMonth());
        System.out.println(heartRates.getYearOfDate());
        System.out.println(heartRates.calculateAge());
        System.out.println(heartRates.calculateMaximumHeartRate());
        System.out.println( heartRates.calculateMinTargetHeartRate());
        System.out.println(heartRates.calculateMinTargetHeartRate());
//        System.out.println(heartRates.calculateTargetHeartRate());

    }
}
