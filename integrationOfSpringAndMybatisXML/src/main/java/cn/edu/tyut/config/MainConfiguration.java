package cn.edu.tyut.config;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Author 羊羊
 * @ClassName MainConfiguration
 * @SubmitTime 周一
 * @DATE 2023/12/4
 * @Time 15:43
 * @Package_Name cn.edu.tyut.config
 */
@Configuration
@ComponentScan("cn.edu.tyut.entity")
@MapperScan("cn.edu.tyut.dao")
public class MainConfiguration {
    @Bean
    public SqlSessionTemplate sqlSessionTemplate() {
        InputStream  inputStream;
        try {
            inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
        return new SqlSessionTemplate(factory);
    }

//    @Bean
//    public DataSource dataSource() {
//        return new PooledDataSource("com.mysql.cj.jdbc.Driver",
//                "jdbc:mysql://localhost:3306/springtest", "root", "123456");
//    }
//
//    @Bean
//    public SqlSessionFactoryBean sqlSessionFactoryBean(DataSource dataSource) {
//        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
//        bean.setDataSource(dataSource);
//        return bean;
//    }
}