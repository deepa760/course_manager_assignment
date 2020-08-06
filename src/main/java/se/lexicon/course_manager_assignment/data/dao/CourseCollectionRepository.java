package se.lexicon.course_manager_assignment.data.dao;

import se.lexicon.course_manager_assignment.model.Course;
import java.time.LocalDate;
import java.util.*;


public class CourseCollectionRepository implements CourseDao {

    private static List<Course> courseList = new ArrayList<>();


    @Override
    public Course saveCourse(Course course) {
        if (!courseList.contains(course)) {
            courseList.add(course);
            System.out.println(course.getCourseName() + " added");
            return course;
        }
        return null;
    }


    @Override
    public Course findById(int id) {
        for (Course course : courseList) {
            if (course.getCourseId() == id) {
                return course;
            }
        }
        return null;
    }


    @Override
    public List<Course> findByName(String name) {
        List<Course> tempList = new ArrayList<>();
        for (Course course : courseList) {
            if (course.getCourseName().equalsIgnoreCase(name)) {
                tempList.add(course);
            }
        }
        return tempList;
    }


    @Override
    public List<Course> findByDate(LocalDate date) {
        List<Course> tempList = new ArrayList<>();
        for (Course course : courseList) {
            if (course.getStartDate().isEqual(date)) {
                tempList.add(course);
            }
        }
        return tempList;
    }


    @Override
    public List<Course> findAll() {
        return courseList;
    }

    @Override
    public boolean removeCourse(Course course) {
        if (courseList.contains(course)) {
            courseList.remove(course);
            return true;
        }
        return false;
    }
}
