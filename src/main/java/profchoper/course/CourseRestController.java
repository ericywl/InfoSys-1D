package profchoper.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseRestController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/api/courses")
    public List<Course> getAllCourses() {
        return courseService.getAllCourses();
    }

    @GetMapping("/api/courses/{id}")
    public Course getCourseById(@PathVariable String id) {
        return courseService.getCourseById(id);
    }
}
