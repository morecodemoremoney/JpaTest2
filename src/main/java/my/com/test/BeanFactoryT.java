package my.com.test;


import my.com.entity.Student;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ApplicationObjectSupport;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

import java.lang.annotation.Annotation;
import java.util.Map;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author bh.xia
 * @date 2020/8/26 15:10
 */
@Component
public class BeanFactoryT  implements CommandLineRunner {

    public void run(String... args) throws Exception {

        //System.out.println("上下文名字："+context.getApplicationName());
        //System.out.println("bean数量："+context.getBeanDefinitionCount());
    }

}
