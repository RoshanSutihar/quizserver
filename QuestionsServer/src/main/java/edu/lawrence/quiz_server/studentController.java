package edu.lawrence.quiz_server;


import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
@CrossOrigin(origins="*")
public class studentController {


    private StudentDAO studentDAO;

    public studentController(StudentDAO dao) {
        this.studentDAO = dao;
    }

    @GetMapping
    public List<Student> findStudent() {

        return studentDAO.findAllStudents();

    }
}
