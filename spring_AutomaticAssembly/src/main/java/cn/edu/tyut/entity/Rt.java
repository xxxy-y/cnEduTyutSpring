package cn.edu.tyut.entity;

/**
 * @Author 羊羊
 * @ClassName RT
 * @SubmitTime 周一
 * @DATE 2023/11/20
 * @Time 17:28
 * @Package_Name cn.edu.tyut.entity
 */
public class Rt {
    private ArtTeacher artTeacher;

    public void setArtTeacher(ArtTeacher artTeacher) {
        this.artTeacher = artTeacher;
    }

    @Override
    public String toString() {
        return "Rt{" +
                "artTeacher=" + artTeacher +
                '}';
    }
}
