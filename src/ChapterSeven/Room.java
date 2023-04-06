package ChapterSeven;

import java.util.Arrays;

public class Room {

    public static void main(String[] args) {
        Student[] students = new Student[3];
        Student inem = new Student();
        inem.setFullName("inemesit legend");
        inem.setJavaScore(67);
        inem.setDataBaseScore(12);
        inem.setPythonScore(99);



        Student goodness = new Student();
        goodness.setFullName("goodness chinedu");
        goodness.setJavaScore(50);
        goodness.setPythonScore(70);
        goodness.setDataBaseScore(90);



        Student favour = new Student();
        favour.setFullName("Favour Nwadike");
        favour.setPythonScore(70);
        favour.setDataBaseScore(60);
        favour.setJavaScore(89);


        students[0] =inem;
        students[1] = goodness;
        students[2] = favour;


        for(Student student:students){
//            System.out.println(student);
        }
        Arrays.stream(students).forEach(student-> {
            System.out.println(student);

        });

    }
}
