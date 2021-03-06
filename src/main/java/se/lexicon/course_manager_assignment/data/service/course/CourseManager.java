package se.lexicon.course_manager_assignment.data.service.course;
import org.springframework.stereotype.Service;
import se.lexicon.course_manager_assignment.data.dao.CourseDao;
import se.lexicon.course_manager_assignment.data.dao.StudentDao;
import se.lexicon.course_manager_assignment.data.service.converter.Converters;
import se.lexicon.course_manager_assignment.dto.forms.CreateCourseForm;
import se.lexicon.course_manager_assignment.dto.forms.CreateStudentForm;
import se.lexicon.course_manager_assignment.dto.forms.UpdateCourseForm;
import se.lexicon.course_manager_assignment.dto.forms.UpdateStudentForm;
import se.lexicon.course_manager_assignment.dto.views.CourseView;
import se.lexicon.course_manager_assignment.dto.views.StudentView;
import se.lexicon.course_manager_assignment.model.Course;
import se.lexicon.course_manager_assignment.model.Student;
import java.time.LocalDate;
import java.util.List;


@Service
public class CourseManager implements CourseService {

    private final CourseDao courseDao;
    private final StudentDao studentDao;
    private final Converters converters;

    public CourseManager(CourseDao courseDao, StudentDao studentDao, Converters converters) {
        this.courseDao = courseDao;
        this.studentDao = studentDao;
        this.converters = converters;
    }

    public CourseView create(CreateCourseForm form) {

        Course course=courseDao.createCourse(form.getCourseName(), form.getStartDate());
        return converters.courseToCourseView(course);
    }

    public StudentView update(UpdateStudentForm form) {

        Student toUpdate = studentDao.findById(form.getId());
        //Returning the converters ....
        if (toUpdate != null) {
            toUpdate.setName(form.getName());
            toUpdate.setEmail(form.getEmail());
            toUpdate.setAddress(form.getAddress());
            return converters.studentToStudentView(toUpdate);
        }
        return null;
    }


    @Override
    public CourseView update(UpdateCourseForm form) {
        return null;
    }

    @Override
    public List<CourseView> searchByCourseName(String courseName) {
        return null;
    }

    @Override
    public List<CourseView> searchByDateBefore(LocalDate end) {
        return null;
    }

    @Override
    public List<CourseView> searchByDateAfter(LocalDate start) {
        return null;
    }

    @Override
    public boolean addStudentToCourse(int courseId, int studentId) {
        return false;
    }

    @Override
    public boolean removeStudentFromCourse(int courseId, int studentId) {
        return false;
    }

    @Override
    public CourseView findById(int id) {
        return null;
    }

    @Override
    public List<CourseView> findAll() {
        return null;
    }

    @Override
    public List<CourseView> findByStudentId(int studentId) {
        return null;
    }

    @Override
    public boolean deleteCourse(int id) {
        return false;
    }
}
