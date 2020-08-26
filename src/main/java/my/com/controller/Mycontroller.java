package my.com.controller;

import my.com.entity.Student;
import my.com.reposity.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author bh.xia
 * @date 2020/8/26 1:28
 */
@RestController
@RequestMapping("/test")
public class Mycontroller {
    @Autowired
    private StudentRepository repository;
    @RequestMapping("/test")
    public ResponseEntity<List<Student>> q(Integer id) {
        List<Student> student = repository.findAll();
        return ResponseEntity.ok(student);
    }
}
