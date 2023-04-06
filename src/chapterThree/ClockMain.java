package chapterThree;

public class ClockMain {
    public static void main(String[] args) {
        Clock clock = new Clock(23,59,59);
        clock.getHour();
        clock.getMinute();
        clock.getSecond();
//        clock.displayTime("hh:mm:ss");
        System.out.println("HOUR:"+ clock.getHour());
        System.out.println( "MINUTE:"+ clock.getMinute());
        System.out.println("SECOND:"+ clock.getSecond());
        clock.displayTime();
//        System.out.println(clock.displayTime("hh:mm:ss"));
    }
}
