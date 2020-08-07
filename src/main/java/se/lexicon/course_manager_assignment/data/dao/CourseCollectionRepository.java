package se.lexicon.course_manager_assignment.data.dao;

import se.lexicon.course_manager_assignment.data.sequencers.CourseSequencer;
import se.lexicon.course_manager_assignment.data.sequencers.StudentSequencer;
import se.lexicon.course_manager_assignment.model.Course;
import se.lexicon.course_manager_assignment.model.Student;

import javax.sound.midi.Sequencer;
import java.time.LocalDate;
import java.util.*;


public class CourseCollectionRepository implements CourseDao {

    private Collection<Course> courses;

    public CourseCollectionRepository(Collection<Course> courses) {
    }

    @Override
    public Course createCourse(Course course) {

  Course object1=new Course(StudentSequencer.nextStudentId(),course.getCourseName(),course.getStartDate(),course.getCourseDuration() );

        if (!courses.contains(course)) {
            courses.add(course);
            System.out.println(course.getCourseName() + " added");
            return course;
        }
        return null;
    }


    @Override
    public Course findById(int id) {
        for (Course course : courses) {
            if (course.getCourseId() == id) {
                return course;
            }
        }
        return null;
    }


    @Override
    public List<Course> findByName(String name) {
        List<Course> tempList = new ArrayList<>();
        for (Course course : courses) {
            if (course.getCourseName().equalsIgnoreCase(name)) {
                tempList.add(course);
            }
        }
        return tempList;
    }


    @Override
    public List<Course> findByDate(LocalDate date) {
        List<Course> tempList = new ArrayList<>();
        for (Course course : courses) {
            if (course.getStartDate().isEqual(date)) {
                tempList.add(course);
            }
        }
        return tempList;
    }


    public List<Course> findAll()
    {
        List  list = new ArrayList(courses);//Coverting a Collection to a List
        return list;
    }



   /* @Override
    public List<Course> findAll() {
        return courses;
    }*/

    @Override
    public boolean removeCourse(Course course) {
        if (courses.contains(course)) {
            courses.remove(course);
            return true;
        }
        return false;
    }
}
