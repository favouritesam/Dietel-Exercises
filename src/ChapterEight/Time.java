package ChapterEight;

public class Time {
    private int hour;
    private int minute;
    private int second;




    public Time(int hour, int minute, int second){
        validate(hour,minute,second);
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public Time(int hour,int minute){
//        this.hour = hour;
//        this.minute = minute;
        this(hour,minute,0);
    }
    public Time(int hour){
        this(hour,0);
    }
    public static void validate(int hour, int minute, int seconds){
        validateHour(hour);
        validateMinute(minute);
        validateSeconds(seconds);

    }

    public static void validateHour(int hour){
        boolean hourIsInvalid = hour < 0 || hour > 11;
        if (hourIsInvalid) throw new IllegalArgumentException("Hour is valid");
    }
    public static void validateMinute(int minute){
        boolean minuteIsInvalid = minute < 0 || minute > 59;
        if (minuteIsInvalid) throw new IllegalArgumentException("Minute is valid");
    }
    public static void validateSeconds(int seconds){
        boolean secondsIsInvalid = seconds < 0 || seconds > 60;
        if (secondsIsInvalid) throw new IllegalArgumentException("Seconds is valid");
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        validateHour(hour);
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        validateMinute(minute);
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        validateSeconds(second);
        this.second = second;
    }
}
