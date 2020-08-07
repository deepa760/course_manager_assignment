package se.lexicon.course_manager_assignment.model;
import java.time.LocalDate;
import java.util.ArrayList;

import java.util.List;
import java.util.Objects;

public class Course {

    private static int courseCounter;
    private int courseId;
    private String courseName;
    private LocalDate startDate;
    private int courseDuration;
    private List<Student> studentList;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return courseId == course.courseId &&
                courseDuration == course.courseDuration &&
                courseName.equals(course.courseName) &&
                startDate.equals(course.startDate) &&
                studentList.equals(course.studentList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(courseId, courseName, startDate, courseDuration, studentList);
    }

    public Course(int courseId, String courseName, LocalDate startDate, int courseDuration) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.startDate = startDate;
        this.courseDuration = courseDuration;

    }

    public Course(String courseName, LocalDate startDate, int courseDuration)
    {
        this (++courseCounter,courseName,startDate,courseDuration);
    }

    public Course(int courseId, String courseName, LocalDate startDate, int courseDuration, List<Student> studentList) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.startDate = startDate;
        this.courseDuration = courseDuration;
        this.studentList = studentList;
    }

    public int getCourseId() {
        return courseId;
    }
    public String getCourseName() {
        return courseName;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public LocalDate getStartDate() {
        return startDate;
    }
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }
    public int getCourseDuration() {
        return courseDuration;
    }
    public void setCourseDuration(int courseDuration) {
        this.courseDuration = courseDuration;
    }


    public void addStudent (Student student){
        if (!studentList.contains(student)) {
            studentList.add(student);
            System.out.println(student.getStudentName()+" added to "+getCourseName());
        }
    }
    public void removeStudent (int id){
        removeStudent(findById(id));
    }
    public void removeStudent (Student student){
        System.out.println(student.getStudentName()+" removed from "+getCourseName());
        studentList.remove(student);
    }
    public Student findByEmail (String email){
        for (Student student:studentList) {
            if (student.getEmail().equalsIgnoreCase(email)){
                return student;
            }
        }
        return null;
    }
    public Student findById (int id){
        for (Student student:studentList) {
            if (student.getStudentId() == id){
                return student;
            }
        }
        return null;
    }
    public void getInfo(){
        System.out.println("\n-----------COURSE--INFO-----------"+
                "\nName: "+getCourseName()+
                "\nID: "+getCourseId()+
                "\nStart date: "+getStartDate()+
                "\nCourse duration: "+getCourseDuration()+" weeks\n"+
                "-----------COURSE--INFO-----------\n");
    }
}
}
