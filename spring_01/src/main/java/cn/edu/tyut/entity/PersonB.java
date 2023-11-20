package cn.edu.tyut.entity;

/**
 * @Author 羊羊
 * @ClassName PersonB
 * @SubmitTime 周一
 * @DATE 2023/11/20
 * @Time 20:15
 * @Package_Name cn.edu.tyut.entity
 */
public class PersonB {
    private String name;
    private String age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "PersonB{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    public void init() {
        System.out.println("init");
    }
}
