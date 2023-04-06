package studentManagement;

public class Student {
    private String firstName;
    private String lastName;
    private String id;
    private String email;

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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
        public Student apply (StudentData studentData){
            School school = new School();
            Student student = new Student();
            student.setFirstName(studentData.getFirstName());
            student.setLastName(studentData.getLastName);
            student.setEmail(studentData.getEmail());
            school.adminStudent(student);
            return student;
        }

    }
