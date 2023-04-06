package Chapter4;

public class controlStatements {
    private String name;
    private double average;
    public String student;

    public controlStatements(String name, double average) {
        this.name = name;
        if (average > 0.0) {
            if (average <= 100.0) {
                this.average = average;
            }
        }
    }

    //set the student name
    public void setName(String name) {
        this.name = name;
    }

    //retrieves the student's name
    public String getName() {
        return name;
    }

    public void setAverage(double average) {
        if (average > 0.0) {
            if (average <= 100.0) {
                this.average = average;

            }
        }
    }
//retrieves the student's average
    public double getAverage() {
        return average;
    }
    //determine and returns the student's letter grade

}