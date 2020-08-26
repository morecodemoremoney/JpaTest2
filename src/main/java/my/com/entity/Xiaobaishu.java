package my.com.entity;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * <p>
 * Description: 复习yml实现依赖注入 两种方式
 * 1.@Value
 * 2.@ConfigurationProperties(推荐)需要set方法
 * </p>
 *
 * @author bh.xia
 * @date 2020/8/26 16:42
 */
@Component
@Slf4j
@ConfigurationProperties(prefix = "my.xiaobaishu")
public class Xiaobaishu  {
    //@Value("${my.xiaobaishu.id}")
    private int id;
    // @Value("${my.xiaobaishu.msg}")
    private String msg;

    public Xiaobaishu() {
    }


    @Override
    public String toString() {
        return id + msg;
    }


}
