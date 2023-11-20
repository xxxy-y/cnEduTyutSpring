package cn.edu.tyut.entity;

/**
 * @Author 羊羊
 * @ClassName Bean3Factory
 * @SubmitTime 周一
 * @DATE 2023/11/20
 * @Time 15:53
 * @Package_Name cn.edu.tyut.entity
 */
public class Bean3Factory {
    public Bean3Factory() {
        System.out.println("Bean3 factory is instantiating");
    }

    public Bean3 createBean() {
        return new Bean3();
    }
}
