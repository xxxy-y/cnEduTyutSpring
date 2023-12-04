package cn.edu.tyut.config;

import org.apache.ibatis.datasource.pooled.PooledDataSource;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.TransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;

/**
 * @Author 羊羊
 * @ClassName MainConfiguration
 * @SubmitTime 周一
 * @DATE 2023/12/4
 * @Time 19:24
 * @Package_Name cn.edu.tyut.config
 */
@Configuration
@EnableTransactionManagement
@ComponentScans({
        @ComponentScan("cn.edu.tyut.entity"),
        @ComponentScan("cn.edu.tyut.service")
})
@MapperScan("cn.edu.tyut.dao")
public class MainConfiguration {
    private static final InputStream INPUT_STREAM;

    static {
        try {
            INPUT_STREAM = Resources.getResourceAsStream("mybatis-config.xml");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Bean
    public DataSource dataSource() {
        return new PooledDataSource("com.mysql.cj.jdbc.Driver",
                "jdbc:mysql://localhost:3306/springtest", "root", "123456");
    }

    @Bean
    public SqlSessionTemplate sqlSessionTemplate() {
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(INPUT_STREAM);
        return new SqlSessionTemplate(factory);
    }

    @Bean
    public TransactionManager transactionManager(DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }
}