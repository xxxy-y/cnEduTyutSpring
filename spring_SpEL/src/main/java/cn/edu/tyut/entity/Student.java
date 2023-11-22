package cn.edu.tyut.entity;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @Author 羊羊
 * @ClassName Student
 * @SubmitTime 周三
 * @DATE 2023/11/22
 * @Time 14:36
 * @Package_Name cn.edu.tyut.entity
 */
@Component
public class Student {
    @Getter
    @Value("10")
    private String name;

    public Map<String, String> map = Map.of("test", "你干嘛");
    public List<String> list = List.of("AAA", "BBB", "CCC");
    public List<Clazz> list1 = List.of(new Clazz("高等数学", 4));

    public record Clazz(String name, int score) {
    }

    /**
     * 构造方法注入，和直接注入字段任何单个都可以达到这种效果
     * 如果字段注入和构造函数注入都使用的话，会优先使用字段注入的值
     *
     * @param name >
     */
    public void setName(@Value("${test.name}") String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void test() {
        System.out.println("success");
    }
}
