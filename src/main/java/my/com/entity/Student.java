package my.com.entity;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author bh.xia
 * @date 2020/8/25 18:46
 */
@Entity
@Slf4j
public class Student implements InitializingBean {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String address;

    public Student() {
        log.info("student无参准备完毕");
    }
    public Student(String name, String address) {
        this.name = name;
        this.address = address;
        log.info("student有参准备完毕");

    }

    @Override
    public String toString() {
        return String.format(
                "Student[id=%d,name='%s',address='%s']", id, name, address
        );
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public void afterPropertiesSet() throws Exception {
        log.debug("student开始初始化了");
    }
}
