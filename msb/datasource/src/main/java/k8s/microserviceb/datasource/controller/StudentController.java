package k8s.microserviceb.datasource.controller;

import k8s.microserviceb.datasource.dao.StudentsDAO;
import k8s.microserviceb.datasource.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    @GetMapping("/students")
    public List<Student> getStudents(
            @RequestParam(value = "name") String name,
            @RequestParam(value = "class") String classLevel,
            @RequestParam(value = "option") String option,
            @RequestParam(value = "group") int group
    ) {
        return StudentsDAO.getStudents(name, classLevel, option, group);
    }
}
