package my.com.reposity;

import my.com.entity.Student;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author bh.xia
 * @date 2020/8/25 18:56
 */
public interface StudentRepository extends CrudRepository<Student,Long> {
    List<Student> findByName(String name);
    Student findById(long id);
    List<Student> findAll();

}
