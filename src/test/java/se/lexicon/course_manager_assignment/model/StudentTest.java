package se.lexicon.course_manager_assignment.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;
import se.lexicon.course_manager_assignment.model.Course;
import se.lexicon.course_manager_assignment.model.Student;
import org.junit.Before;
import java.time.LocalDate;
import java.time.LocalDate;
import java.util.*;

public class StudentTest {

    private Student testObject;
    public void testObject_Successfully_created()
    {

        testObject=new Student(1,"hema","hemaghg@gmail.com","Almhult");
        assertEquals(1, testObject.getStudentId());
        assertEquals("Hema", testObject.getStudentName());
        assertEquals("hemaghg@gmail.com", testObject.getEmail());
        assertEquals("India", testObject.getAddress());

    }
    @Test

    public void test_equals_and_hashcode() {
        testObject = new Student(1, "hema", "hemaghg@gmail.com", "Vaxjo");
        Student copy = new Student(1, "hema", "hemaghg@gmail.com", "Vaxjo");
        assertEquals(copy, testObject);//equal method test
        System.out.println("Test Object HashCode: " + testObject.hashCode());
        System.out.println("Copy Object HashCode: " + copy.hashCode());
        assertEquals(copy.hashCode(), testObject.hashCode());//hash code method test
    }
    @Test
    public void test_toString_contains_correct_information() {

        testObject = new Student(2, "Test", "hematest@gmail.com", "Test Address");

        String toString = testObject.toString();

        assertTrue(

                toString.contains("2") &&

                        toString.contains("Test") &&

                        toString.contains("hematest@gmail.com") &&

                        toString.contains("Test Address")

        );

    }

}



