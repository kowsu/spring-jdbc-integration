package ir.seefa.tutorial.spring;

import ir.seefa.tutorial.spring.config.ApplicationConfiguration;
import ir.seefa.tutorial.spring.repository.ContactDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Saman Delfani
 * @version 1.0
 * @since 10 Sep 2020 T 00:34:19
 */
// 1. Read spring-core-tutorial before starting this project because primary annotations and logic explained there
public class Application {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        ContactDao contactDao = (ContactDao) context.getBean("contactDaoImpl");
        contactDao.findByPhoneWithNamedParameters("09137390432");
    }
}
