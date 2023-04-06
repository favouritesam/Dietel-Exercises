package studentManagement;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    private Student prospectiveStudent;
    private StudentData studentData;
    School school;
    @BeforeEach
    void setUp(){
        prospectiveStudent = new Student();
        studentData = new StudentData();
      school = new School();

    }
     @Test
    void testThatStudentCanApply(){
        prospectiveStudent.setFirstName("favour");
        prospectiveStudent.setLastName("Nwadike");
        prospectiveStudent.setEmail("favsamlol@gmail.com");
        Student registeredStudent = prospectiveStudent.apply(studentData);

         System.out.println(registeredStudent);
         System.out.println(prospectiveStudent.getFirstName());
         assertNotNull(registeredStudent);
     }
    @Test
    void testThatNumberOfRegisteredStudent(){
//        register student
        Student registeredStudent = prospectiveStudent.apply(studentData);
        System.out.println(registeredStudent);
        assertNotNull(registeredStudent);
//        check that the list of student has increased to 1
        int studentSize = school.getTotalNumberOfRegisteredStudent();
        assertEquals(1,studentSize);
    }

}