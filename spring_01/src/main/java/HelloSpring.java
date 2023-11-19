import lombok.Data;

/**
 * @Author 羊羊
 * @ClassName HelloSpring
 * @SubmitTime 周日
 * @DATE 2023/11/19
 * @Time 11:06
 * @Package_Name PACKAGE_NAME
 */
@Data
public class HelloSpring {
    private String username;
    public void show(){
        System.out.println(username + " 欢迎来到Spring");
    }
}
