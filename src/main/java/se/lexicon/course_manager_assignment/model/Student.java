package se.lexicon.course_manager_assignment.model;
import java.util.Objects;


public class Student {
    private int studentId;
    private String studentName;
    private String email;
    private String address;
    public Student() {
    }


    public Student(int studentId, String studentName, String email, String address) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.email = email;
        this.address = address;
    }

    public int getStudentId() {
        return studentId;
    }
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentId == student.studentId &&
                studentName.equals(student.studentName) &&
                email.equals(student.email) &&
                address.equals(student.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId, studentName, email, address);
    }
/*

    public void getInfo(){
        System.out.println("\n-----------STUDENT-INFORMATION IN ASSIGNMENT-----------"+
                "\nName: "+this.getName()+
                "\nID: "+getStudentId()+
                "\nEmail: "+getEmail()+
                "\nAddress: "+getAddress()+"\n"+
                "-----------STUDENT-INFO-----------\n");
    }*/

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", name='" + studentName + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}




