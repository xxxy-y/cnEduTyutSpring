import lombok.Data;

/**
 * @Author 羊羊
 * @ClassName User1
 * @SubmitTime 周日
 * @DATE 2023/11/19
 * @Time 11:20
 * @Package_Name PACKAGE_NAME
 */
@Data
public class User1 {
    private Integer id;
    private String name;
    private String password;

    public User1(int id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }
}
