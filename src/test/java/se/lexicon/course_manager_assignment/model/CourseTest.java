package se.lexicon.course_manager_assignment.model;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;
import se.lexicon.course_manager_assignment.model.Course;
import se.lexicon.course_manager_assignment.model.Student;
import org.junit.Before;
import java.time.LocalDate;
import java.time.LocalDate;
import java.util.*;


public class CourseTest {
    private Course testCourse;
    private Student testStudent;

    @Before
    public void init(){
        testCourse = new Course(1,"Test Course", LocalDate.parse("2020-01-01"),5);
        testStudent= new Student(1,"Test Student","hema@email.com","Test Address");
    }

    @Test
    public void test_FindByEmail(){
        testCourse.addStudent(testStudent);
        Student expected = testStudent;
        Student actual = testCourse.findByEmail("test@email.com");
        assertEquals(expected,actual);
        assertEquals(null,testCourse.findByEmail("nulllll"));
    }

    @Test
    public void test_FindById(){
        testCourse.addStudent(testStudent);
        Student expected = testStudent;
        Student actual = testCourse.findById(1);
        assertEquals(expected,actual);
        assertEquals(null,testCourse.findById(5));

    }
}

