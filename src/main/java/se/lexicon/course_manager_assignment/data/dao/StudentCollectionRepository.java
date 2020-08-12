package se.lexicon.course_manager_assignment.data.dao;

import se.lexicon.course_manager_assignment.data.sequencers.StudentSequencer;
import se.lexicon.course_manager_assignment.model.Student;

import java.util.ArrayList;
import java.util.*;
import java.util.List;

import se.lexicon.course_manager_assignment.model.Course;


public class StudentCollectionRepository implements StudentDao {
    private Collection<Student> students;

    @Override
    public Student createStudent(String name, String email, String address) {
        Student student = new Student(StudentSequencer.nextStudentId(), name, email, address);
        students.add(student);
        System.out.println(student.getStudentName() + " added");
        return student;


    }

    @Override
    public Student findByEmail(String email) {
        for (Student student : students) {
            if (student.getEmail().equalsIgnoreCase(email)) {
                return student;
            }
        }
        return null;
    }


    @Override
    public Student findById(int id) {
        for (Student student : students) {
            if (student.getStudentId() == id) {
                return student;
            }
        }
        return null;
    }


    @Override
    public List<Student> findByName(String name) {
        List<Student> tempList = new ArrayList<>();
        for (Student student : students) {
            if (student.getStudentName().equalsIgnoreCase(name)) {
                tempList.add(student);
            }
        }
        return tempList;
    }


    @Override
    public List<Student> findAll() {
        List list = new ArrayList(students);//Coverting a Collection to a List

        return list;
    }


    @Override
    public boolean removeStudent(Student student) {
        if (students.contains(student)) {
            System.out.println(student.getStudentName() + " removed");
            students.remove(student);
            return true;
        }
        return false;
    }

    @Override
    public Student findByEmailIgnoreCase(String value) {
        return null;
    }
}



