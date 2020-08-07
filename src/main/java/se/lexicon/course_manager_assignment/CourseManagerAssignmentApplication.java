package se.lexicon.course_manager_assignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.time.LocalDate;
import java.util.*;
import se.lexicon.course_manager_assignment.model.Student;
import se.lexicon.course_manager_assignment.model.Course;

@SpringBootApplication
public class CourseManagerAssignmentApplication {

    public static void main(String[] args) {
        SpringApplication.run(CourseManagerAssignmentApplication.class, args);
    }

//Choice creation....
    public void choice1Create(){
        Scanner choice1Scanner = new Scanner(System.in);
        System.out.println("(1) Create new student\n(2) Create new course");
        String choice1secondChoice = choice1Scanner.nextLine();
        if (choice1secondChoice.equalsIgnoreCase("1")) {
            System.out.println("Enter full name, email and address - In that order.");
            Student newStudent = new Student(choice1Scanner.nextLine(), choice1Scanner.nextLine(), choice1Scanner.nextLine());
            studentCollectionRepository.saveStudent(newStudent);
        }else if (choice1secondChoice.equalsIgnoreCase("2")) {
            System.out.println("Enter course name");
            try {
                String tempName = choice1Scanner.nextLine();
                System.out.println("Enter start date (YYYY-MM-DD)");
                String tempDate = choice1Scanner.nextLine();
                System.out.println("Enter duration of course (number of weeks)");
                int tempDuration = choice1Scanner.nextInt();
                Course newCourse = new Course(tempName, LocalDate.parse(tempDate), tempDuration);
                courseList.saveCourse(newCourse);
            }catch (InputMismatchException|DateTimeParseException e){
                System.out.println("Enter valid date (YYYY-MM-DD) / Enter valid course duration (0-9)");
            }
        }else {
            System.out.println("Make a choice between 1 - 2");
        }
    }
}
