package studentManagement;

import java.util.ArrayList;
import java.util.List;

public class School {
    private static List<Student>studentList = new ArrayList<>();
    public void adminStudent(Student student){
        studentList.add(student);
    }
    public int getTotalNumberOfRegisteredStudent(){
        return studentList.size();
    }
}
