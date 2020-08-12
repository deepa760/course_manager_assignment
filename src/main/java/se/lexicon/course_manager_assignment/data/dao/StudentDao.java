package se.lexicon.course_manager_assignment.data.dao;



import se.lexicon.course_manager_assignment.model.Student;

import java.util.List;

public interface StudentDao {
    Student createStudent(String name, String email, String address);
    Student findByEmail(String email);
    Student findById(int id);
    List<Student> findByName(String name);
    List<Student> findAll();
    boolean removeStudent(Student student);

    Student findByEmailIgnoreCase(String value);
}