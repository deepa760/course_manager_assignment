package se.lexicon.course_manager_assignment.data.dao;



import se.lexicon.course_manager_assignment.model.Student;

import java.util.List;

public interface StudentDao {
    Student saveStudent(Student student);
    Student findByEmail(String email);
    Student findById(int id);
    List<Student> findByName(String name);
    List<Student> findAll();
    boolean removeStudent(Student student);
}