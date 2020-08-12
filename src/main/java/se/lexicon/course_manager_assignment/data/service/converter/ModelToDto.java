package se.lexicon.course_manager_assignment.data.service.converter;

import com.sun.deploy.net.MessageHeader;
import org.springframework.stereotype.Component;
import se.lexicon.course_manager_assignment.dto.views.CourseView;
import se.lexicon.course_manager_assignment.dto.views.StudentView;
import se.lexicon.course_manager_assignment.model.Course;
import se.lexicon.course_manager_assignment.model.Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Component
public class ModelToDto implements Converters {
    @Override
    public StudentView studentToStudentView(Student student) {
        StudentView objectview = new StudentView(student.getStudentId(), student.getStudentName(), student.getEmail(), student.getAddress());
        return objectview;
    }

    @Override
    public CourseView courseToCourseView(Course course) {
        return null;
    }

    @Override
    public List<CourseView> coursesToCourseViews(Collection<Course> courses) {
        return null;
    }

    @Override
    public List<StudentView> studentsToStudentViews(Collection<Student> students)

          if (students == null)
              student=new ArrayList<>();
          for(Student student:Student) {

        objectview.add(studentToStudentView(student));

    }
}

