package cn.edu.tyut.entity;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @Author 羊羊
 * @ClassName User
 * @SubmitTime 周一
 * @DATE 2023/11/20
 * @Time 16:18
 * @Package_Name cn.edu.tyut.entity
 */
@Component
@Scope("singleton")
public class User {
    @Value("1")
    private Integer id;
    @Value("张三")
    private String name;
    @Value("123456")
    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", name='" + name + '\'' + ", password='" + password + '\'' + '}';
    }

    @PostConstruct
    public void init() {
        System.out.println("Bean(User) init success, exe init() method");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Bean(User) exe destroy() method before destroy");
    }
}
