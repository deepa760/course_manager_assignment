package se.lexicon.course_manager_assignment.data.dao;

import se.lexicon.course_manager_assignment.model.Course;

import java.time.LocalDate;
import java.util.List;

public interface CourseDao {
    Course createCourse(Course course);
    Course findById(int id);
    List<Course> findByName(String name);
    List<Course> findByDate(LocalDate date);
    List<Course> findAll();
    boolean removeCourse(Course course);
}