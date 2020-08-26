package my.com.controller;

import lombok.extern.slf4j.Slf4j;
import my.com.entity.Student;
import my.com.entity.Xiaobaishu;
import my.com.reposity.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
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
@Slf4j
public class Mycontroller {
    @Autowired
    private StudentRepository repository;
    @Autowired
    public Xiaobaishu shu;

    /**
     *
     * @param id
     * @return
     */
    @RequestMapping("/test/{id}")
    public ResponseEntity<List<Student>> q(@PathVariable Integer id) {
        List<Student> student = repository.findAll();
        System.out.println("**************************");
        System.out.println("shu:"+shu.toString());
        return ResponseEntity.ok(student);
    }
}
