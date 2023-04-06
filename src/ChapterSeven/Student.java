package ChapterSeven;

public class Student {
    private String fullName;
    private int javaScore;
    private int pythonScore;
    private int dataBaseScore;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getJavaScore() {
        return javaScore;
    }

    public void setJavaScore(int javaScore) {
        this.javaScore = javaScore;
    }

    public int getPythonScore() {
        return pythonScore;
    }

    public void setPythonScore(int pythonScore) {
        this.pythonScore = pythonScore;
    }

    public int getDataBaseScore() {
        return dataBaseScore;
    }

    public void setDataBaseScore(int dataBaseScore) {
        this.dataBaseScore = dataBaseScore;
    }

    @Override
    public String toString() {
        return String.format("Student" +
                "fullName='" + fullName + '\'' +
                ", javaScore=" + javaScore +
                ", pythonScore=" + pythonScore +
                ", dataBaseScore=" + dataBaseScore );
    }
}
