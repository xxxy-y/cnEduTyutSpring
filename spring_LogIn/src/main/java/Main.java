import cn.edu.tyut.dao.StudentDao;
import cn.edu.tyut.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Objects;
import java.util.Scanner;

/**
 * @Author 羊羊
 * @ClassName Main
 * @SubmitTime 周日
 * @DATE 2023/12/3
 * @Time 18:13
 * @Package_Name PACKAGE_NAME
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentDao studentDao = applicationContext.getBean("studentDao", StudentDao.class);
        Scanner scanner = new Scanner(System.in);
        System.out.println("欢迎来到学生管理系统");
        System.out.println("请输入用户名 :");
        String username = scanner.nextLine();
        System.out.println("请输入" + username + "的密码 :");
        String password = scanner.nextLine();
        Student student = new Student();
        student.setUsername(username);
        List<Student> list = studentDao.selectAllStudent();
        // anyMatch()方法的作用是判断流中是否存在满足给定条件的元素
        // 它会遍历流中的每个元素，一旦找到满足条件的元素，就立即返回true，并终止后续的遍历。
        // 如果遍历完所有元素都没有找到满足条件的元素，则返回false。
        // 在Lambda表达式中使用anyMatch()方法，我们可以根据需要编写判断条件，用来判断流中的元素是否满足某个条件。
        // s -> s.getUsername().equals(username) 为 lambda 表达式
        boolean isStudentExists = list.stream()
                .anyMatch(s -> s.getUsername().equals(username));
        if (!isStudentExists) {
            System.out.println("该用户不存在");
            return;
        }
        student.setPassword(password);
        Student student1 = studentDao.log(student);
        if (Objects.equals(password, student1.getPassword())) {
            System.out.println("用户登录成功");
            System.out.println(student1.getUsername() + "是" + student1.getGender() + "班的");
        } else {
            System.out.println("用户登录失败");
        }
    }
}
