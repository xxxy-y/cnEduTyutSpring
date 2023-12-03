import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @Author 羊羊
 * @ClassName main
 * @SubmitTime 周六
 * @DATE 2023/12/2
 * @Time 17:26
 * @Package_Name PACKAGE_NAME
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        JdbcTemplate jdbcTemplate = (JdbcTemplate) applicationContext.getBean("jdbcTemplate");
        jdbcTemplate.execute("INSERT INTO account(id, username, balance) VALUES (2, 'wqt', 222.33)");
    }
}
